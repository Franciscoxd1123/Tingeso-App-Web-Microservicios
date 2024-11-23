package org.example.PBClient.controller;

import org.example.PBClient.entity.Client;
import org.example.PBClient.model.Request;
import org.example.PBClient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/requests/{clientRut}")
    public ResponseEntity<List<Request>> getRequests(@PathVariable("clientRut") String clientRut){
        Client client = clientService.getClientByRut(clientRut);
        if(client == null)
            return ResponseEntity.notFound().build();
        List<Request> requests = clientService.getRequests(clientRut);
        return ResponseEntity.ok(requests);
    }

    @PostMapping("/saverequest/{clientRut}")
    public ResponseEntity<Request> saveRequest(@PathVariable("clientRut") String clientRut, @RequestBody Request request){
        if(clientService.getClientByRut(clientRut) == null)
            return ResponseEntity.notFound().build();
        Request requestNew = clientService.saveRequest(clientRut, request);
        return ResponseEntity.ok(requestNew);
    }
}
