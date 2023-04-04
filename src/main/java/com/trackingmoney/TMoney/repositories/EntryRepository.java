package com.trackingmoney.TMoney.repositories;

import com.trackingmoney.TMoney.entities.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends MongoRepository<Entry, String> {
}
