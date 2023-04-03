package com.trackingmoney.TMoney.models;

import lombok.Data;
import lombok.NonNull;

@Data
public class ExpenseModel {

    private String id;
    @NonNull
    private String date;
    @NonNull
    private String description;
    @NonNull
    private Integer typeId;
    @NonNull
    private Double amount;

}
