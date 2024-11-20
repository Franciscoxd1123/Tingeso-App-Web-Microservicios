package org.example.PBClient.service;

import org.example.PBClient.entity.Client;
import org.example.PBClient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }
}
