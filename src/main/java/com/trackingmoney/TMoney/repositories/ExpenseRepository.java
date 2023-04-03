package com.trackingmoney.TMoney.repositories;

import com.trackingmoney.TMoney.entities.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
