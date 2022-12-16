package org.example.service;

import org.example.model.Client;
import org.example.repository.BookRepository;
import org.example.repository.ClientRepository;
import org.example.repository.Domain;
import org.example.repository.LogRepository;

import java.io.IOException;

public class ClientService {



    public Client Login(String nameClient) throws IOException, ClassNotFoundException {
        Client client = new Client("");
        for(int i = 0; i< ClientRepository.getClients().size(); i++){
            if(nameClient.equals(ClientRepository.getClients().get(i))){
//                System.out.println("Вы авторизовались, добро пожаловать, "+nameClient);
                client = ClientRepository.getClients().get(i);
                Domain.ReadFile();
                break;
            }
        }
        if(client != null){
            return client;
        } else return null;
        //                System.out.println("У нас нет такого пользователя");
    }
    public void ExitingTheApp() throws IOException {
        Domain.WriteFile(BookRepository.books, ClientRepository.clients, LogRepository.logs);
    }
}
