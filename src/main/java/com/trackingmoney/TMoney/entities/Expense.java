package com.trackingmoney.TMoney.entities;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor(force = true)
@Document(collection = "expense")
public class Expense{

    @MongoId
    private String id;
    @NonNull
    private LocalDate date;
    @NonNull
    private String description;
    @NonNull
    private Integer typeId;
    @NonNull
    private Double amount;


}
