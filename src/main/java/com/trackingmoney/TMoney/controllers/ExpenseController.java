package com.trackingmoney.TMoney.controllers;

import com.trackingmoney.TMoney.entities.Expense;
import com.trackingmoney.TMoney.models.ExpenseModel;
import com.trackingmoney.TMoney.services.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private final ExpenseService expenseService;
    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addExpense(@RequestBody Expense model){

        Expense expense = expenseService.insertExpense(model);

        return new ResponseEntity(expense, HttpStatus.CREATED);
    }
}
