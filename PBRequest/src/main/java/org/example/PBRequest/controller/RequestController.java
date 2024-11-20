package org.example.PBRequest.controller;

import org.example.PBRequest.entity.Request;
import org.example.PBRequest.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/micro/requests")
@CrossOrigin("*")
public class RequestController {
    @Autowired
    RequestService requestService;

    @GetMapping("/")
    public ResponseEntity<List<Request>> listRequests() {
        List<Request> requests = requestService.getRequests();
        return ResponseEntity.ok(requests);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Request> getRequestById(@PathVariable Long id) {
        Request request = requestService.getRequestById(id);
        return ResponseEntity.ok(request);
    }

    @GetMapping("/rut/{rut}")
    public ResponseEntity<List<Request>> getRequestsByRut(@PathVariable String rut) {
        List<Request> requests = requestService.getRequestsByRut(rut);
        return ResponseEntity.ok(requests);
    }

    @PostMapping("/")
    public ResponseEntity<Request> saveRequest(@RequestBody Request request) {
        Request requestNew = requestService.saveRequest(request);
        return ResponseEntity.ok(requestNew);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Request> updateRequest(@RequestBody Request request, @PathVariable Long id){
        Request requestUpdated = requestService.updateRequest(request, id);
        return ResponseEntity.ok(requestUpdated);
    }

    @PostMapping("/simulation")
    public ResponseEntity<Integer> simulation(@RequestBody Request request) {
        int monthlyPayments = businessLogicService.getMonthlyPayments(request);
        return ResponseEntity.ok(monthlyPayments);
    }

    @GetMapping("/evaluation/{id}")
    public ResponseEntity<Request> evaluateRequest(@PathVariable Long id) {
        Request requestEvaluated = businessLogicService.evaluateRequest(id);
        return ResponseEntity.ok(requestEvaluated);
    }

    @GetMapping("/totalCost/{id}")
    public ResponseEntity<Integer> totalCost(@PathVariable Long id) {
        int totalCost = businessLogicService.calculateTotalCost(id);
        return ResponseEntity.ok(totalCost);
    }
}
