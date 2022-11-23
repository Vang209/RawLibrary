package org.example.view;

import org.example.model.Book;
import org.example.model.Client;
import org.example.model.Genre;
import org.example.repository.BookRepository;
import org.example.repository.ClientRepository;
import org.example.service.List;

import java.util.Scanner;

import static org.example.repository.BookRepository.books;

public class BookData {
    public Book serviceClient(Client client){
        Scanner console = new Scanner(System.in);

        System.out.println("Заполните пожалуйста данные книги");
        System.out.println("Автор?");
        String clientAuthor = console.nextLine();
        System.out.println("Название книги?");
        String clientTitle = console.nextLine();
        System.out.println("Жанр?");
        String clientGenre = console.nextLine();

        Genre clientGenreEnum = Genre.fromTitle(clientGenre);
        Book clientBook = new Book(clientGenreEnum, clientAuthor, clientTitle);
        return clientBook;
    }
}
