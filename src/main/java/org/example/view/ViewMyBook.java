package org.example.view;

import org.example.model.Book;
import org.example.model.Client;
import org.example.service.MyBook;
import org.example.service.TakeReturnBook;

import java.util.Scanner;

public class ViewMyBook {
    public void MyBook(Client client){
        Scanner scanner = new Scanner(System.in);
        BookData bookData = new BookData();
        TakeReturnBook takeReturnBook = new TakeReturnBook();
        MyBook myBook = new MyBook();

        System.out.println("Вы хотите взять или вернуть книгу?");
        System.out.println("1. Взять");
        System.out.println("2. Вернуть");
        System.out.println("3. Книги которые у меня есть");
        System.out.println("4. Вернуться в меню");

        int clientMyBook = scanner.nextInt();
        if(clientMyBook == 1){
            Book book = bookData.serviceClient(client);
            takeReturnBook.TakeBook(client, book);
        } else if (clientMyBook == 2) {
            Book book = bookData.serviceClient(client);
            takeReturnBook.ReturnBook(client, book);
        } else if (clientMyBook == 3) {
            myBook.ClientBook(client);
        }
    }
}
