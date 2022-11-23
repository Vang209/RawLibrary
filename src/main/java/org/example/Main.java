package org.example;

import org.example.model.Client;
import org.example.view.InterfaceApp;
import org.example.view.LoginAccount;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LoginAccount loginAccount = new LoginAccount();
        InterfaceApp interfaceApp = new InterfaceApp();


        Client client = loginAccount.LoginClient();
        interfaceApp.Menu(client);

    }
}