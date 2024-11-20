package org.example.PBClient.controller;

import org.example.PBClient.entity.Client;
import org.example.PBClient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/micro/clients")
@CrossOrigin("*")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/")
    public ResponseEntity<Client> saveClient(@RequestBody Client client) {
        Client newClient = clientService.saveClient(client);
        return ResponseEntity.ok(newClient);
    }
}
