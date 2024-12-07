package com.example.PBEvaluation.controller;

import com.example.PBEvaluation.model.Request;
import com.example.PBEvaluation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/micro/evaluation")
@CrossOrigin("*")
public class EvaluationController {
    @Autowired
    EvaluationService evaluationService;

    @GetMapping("/{id}")
    public ResponseEntity<Request> evaluateRequest(@PathVariable Long id) {
        Request requestEvaluated = evaluationService.evaluateRequest(id);
        return ResponseEntity.ok(requestEvaluated);
    }

    @GetMapping("/totalCost/{id}")
    public ResponseEntity<Integer> totalCost(@PathVariable Long id) {
        int totalCost = evaluationService.calculateTotalCost(id);
        return ResponseEntity.ok(totalCost);
    }
}