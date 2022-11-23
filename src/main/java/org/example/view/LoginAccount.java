package org.example.view;

import org.example.model.Client;
import org.example.service.LoginListClients;

import java.io.IOException;
import java.util.Scanner;

public class LoginAccount {
    public Client LoginClient() throws IOException, ClassNotFoundException {
        LoginListClients llc = new LoginListClients();
        System.out.println("Пожалуйста авторизуйтесь");
        Scanner scanner = new Scanner(System.in);
        String clientString = scanner.nextLine();

        return llc.Login(clientString);
    }
}
