package org.example.view;

import org.example.model.Client;
import org.example.service.List;
import org.example.service.MyBook;

import java.util.Scanner;

public class InterfaceApp {
    public void Menu(Client client){
        Scanner scanner = new Scanner(System.in);
        int numberCommand = scanner.nextInt();
        List list = new List();
        ViewMyBook viewMyBook = new ViewMyBook();


        System.out.println("Пожалуйста ввидите номер команды");

        if (numberCommand == 1) {
            numberCommand = 0;
            while (numberCommand != 1) {
                System.out.println("Что вы хотите?");
                System.out.println("1. Завершить работу");
                System.out.println("2. Список книг");
                System.out.println("3. Спиоск жанров");
                System.out.println("4. Список клиентов");
                System.out.println("5. Мои книги");
                System.out.println("6. Список всех операций");

                numberCommand = scanner.nextInt();

                if (numberCommand == 2) {
                    list.BookList();
                } else if (numberCommand == 3) {
                    list.GenreList();
                } else if (numberCommand == 4) {
                    list.ClientList();
                } else if (numberCommand == 5) {
                    viewMyBook.MyBook(client);
                } else if (numberCommand == 6) {
                    list.LogList();
                }
            }
        }
    }
}
