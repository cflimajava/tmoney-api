package com.trackingmoney.TMoney.services;

import com.trackingmoney.TMoney.entities.Entry;
import com.trackingmoney.TMoney.repositories.EntryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class EntryService {

    @Autowired
    private final EntryRepository repository;
    public Entry insertEntry(Entry entity){
        return repository.save(entity);

    }

}
