package org.example.service;

import org.example.model.Client;
import org.example.repository.BookRepository;

public class MyBook {
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
