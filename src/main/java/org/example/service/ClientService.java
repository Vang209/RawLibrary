package org.example.service;

import org.example.model.Client;
import org.example.model.Genre;
import org.example.repository.BookRepository;
import org.example.repository.ClientRepository;
import org.example.repository.Domain;
import org.example.repository.LogList;

import java.io.IOException;

public class ClientService {
    public void BookList(){
        for (int i = 0; i< BookRepository.books.size(); i++){
            System.out.println(BookRepository.books.get(i));
        }
    }
    public void ClientList(){
        for (int i = 0; i< ClientRepository.clients.size(); i++){
            System.out.println(ClientRepository.clients.get(i));
        }
    }
    public void LogList(){
        for(int i = 0; i< LogList.logs.size(); i++){
            System.out.println(LogList.logs.get(i));
        }
    }
    public void GenreList(){
        Genre[] genres = Genre.values();
        for (Genre genre:genres){
            System.out.println(genre.getTitleGenre());
        }
    }


    public Client Login(String nameClient) throws IOException, ClassNotFoundException {
        Client client = new Client("");
        for(int i = 0; i< ClientRepository.getClients().size(); i++){
            if(nameClient.equals(ClientRepository.getClients().get(i))){
                System.out.println("Вы авторизовались, добро пожаловать, "+nameClient);
                client = ClientRepository.getClients().get(i);
                Domain.ReadFile();
                break;
            } else System.out.println("У нас нет такого пользователя");
        }
        return client;
    }
    public void ExitingTheApp() throws IOException {
        Domain.WriteFile(BookRepository.books, ClientRepository.clients, LogList.logs);
    }
}
