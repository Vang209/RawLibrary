package org.example.repository;

import org.example.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    public static List<Client> clients = new ArrayList<>();

    public static List<Client> getClients() {
        return clients;
    }

    private void addClient(String nameClient){
        Client client = new Client(nameClient);
        clients.add(client);
    }
    private void deletedClient(String nameClient){
        Client client = new Client(nameClient);
        clients.remove(client);
    }
}
