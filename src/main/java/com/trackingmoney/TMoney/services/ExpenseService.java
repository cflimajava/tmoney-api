package com.trackingmoney.TMoney.services;

import com.trackingmoney.TMoney.entities.Expense;
import com.trackingmoney.TMoney.models.ExpenseModel;
import com.trackingmoney.TMoney.repositories.ExpenseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Data
@Service
public class ExpenseService {

    @Autowired
    private final ExpenseRepository repository;
    public Expense insertExpense(Expense model){

        return repository.save(model);
//                Expense.builder()
//                .date(LocalDate.parse(model.getDate()))
//                .typeId(model.getTypeId())
//                .description(model.getDescription())
//                .amount(model.getAmount())
//                .build());

    }

}
