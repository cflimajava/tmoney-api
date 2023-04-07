package com.trackingmoney.TMoney.controllers;

import com.trackingmoney.TMoney.entities.Entry;
import com.trackingmoney.TMoney.services.EntryService;
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
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private final EntryService service;
    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addExpense(@RequestBody Entry entity){

        Entry expense = service.insertEntry(entity);

        return new ResponseEntity(expense, HttpStatus.CREATED);
    }
}
