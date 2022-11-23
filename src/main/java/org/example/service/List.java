package org.example.service;

import org.example.model.Genre;
import org.example.repository.BookRepository;
import org.example.repository.ClientRepository;
import org.example.repository.LogList;

public class List {
    public void BookList(){
        for (int i=0;i< BookRepository.books.size();i++){
            System.out.println(BookRepository.books.get(i));
        }
    }
    public void ClientList(){
        for (int i=0;i< ClientRepository.clients.size();i++){
            System.out.println(ClientRepository.clients.get(i));
        }
    }
    public void LogList(){
        for(int i=0;i< LogList.logs.size();i++){
            System.out.println(LogList.logs.get(i));
        }
    }
    public void GenreList(){
        Genre[] genres = Genre.values();
        for (Genre genre:genres){
            System.out.println(genre.getTitleGenre());
        }
    }
}
