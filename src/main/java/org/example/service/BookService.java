package org.example.service;

import org.example.model.Book;
import org.example.model.Client;
import org.example.model.Log;
import org.example.repository.BookRepository;
import org.example.repository.LogList;

import java.util.Date;

public class BookService {


    public void TakeBook(Client client, Book clientBook){
        int numberOfBooks = 0;
        for (int i = 0; i < BookRepository.books.size(); i++) {
            if (clientBook.equals(BookRepository.books.get(i)) && BookRepository.books.get(i).getId() == null) {
                numberOfBooks++;
                System.out.println("Да, у нас есть такая книга, мы добавили ее в ваш раздел 'Мои книги'");
                BookRepository.books.get(i).setId(client.getUuid());
                Date date = new Date();
                LogList.logs.add(new Log(BookRepository.books.get(i), client.getUuid(), "Взял", date));
                break;
            }
        }
        if (numberOfBooks == 0) {
            System.out.println("У нас нет такой книги или она взята другим клиентом :(");
        }
    }
    public void ReturnBook(Client client, Book filingBookData){
        Book clientBook = filingBookData;
        for (int i = 0; i < BookRepository.books.size(); i++) {
            if (clientBook.equals(BookRepository.books.get(i)) && client.getUuid().equals(BookRepository.books.get(i).getId())) {
                System.out.println("Списибо что вернули книгу");
                Date date = new Date();
                LogList.logs.add(new Log(BookRepository.books.get(i), client.getUuid(), "Вернул", date));
                BookRepository.books.get(i).setId(null);
                break;
            } else System.out.println("Ничего найти не удалось, может вы не так заполнили данные книги?");
        }
    }


    public void ClientBook(Client client){
        int numberOfBooksTheClientHas = 0;
        for (int i = 0; i < BookRepository.books.size(); i++) {
            if (BookRepository.books.get(i).getId() != null) {
                if (BookRepository.books.get(i).getId().equals(client.getUuid())) {
                    numberOfBooksTheClientHas++;
                    System.out.println(
                            BookRepository.books.get(i).getAuthor() + " "
                                    + BookRepository.books.get(i).getTitle() + " "
                                    + BookRepository.books.get(i).getGenre().getTitleGenre());
                }
            }
        }
        if (numberOfBooksTheClientHas == 0) {
            System.out.println("У вас пока нет книг взятых из библиотеки");
        }
    }
}
