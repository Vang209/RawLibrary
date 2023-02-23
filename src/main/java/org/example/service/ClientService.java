package org.example.service;

import org.example.model.Client;
import org.example.repository.BookRepository;
import org.example.repository.ClientRepository;
import org.example.repository.Domain;
import org.example.repository.LogRepository;

import java.io.IOException;

public class ClientService {

    public Client Login(String nameClient){
        System.out.println("Проверка клиента...");
        for (int i=0;i<ClientRepository.clients.size();i++){
            if(ClientRepository.clients.get(i).getNameClient().equals(nameClient)){
                System.out.println("Добро пожаловать "+nameClient);
                return ClientRepository.clients.get(i);
            }
        }
        System.out.println("Нам не удолось найти такого пользователя :(");
        return null;
    }
}
