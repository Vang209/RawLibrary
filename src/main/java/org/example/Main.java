package org.example;

import org.example.model.Client;
import org.example.service.ClientService;
import org.example.view.ClientView;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClientService clientService = new ClientService();
        ClientView clientView = new ClientView();
        Scanner scanner = new Scanner(System.in);


        Client client = clientService.Login(scanner.nextLine());
        clientView.Menu(client);
        clientService.ExitingTheApp();
    }
}