package com.thecodealchemist.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    private String category;
    private int amount;
    private String addedBy;
    private String vendor;

    public Product(String name, String code, String category, int amount, String addedBy, String vendor) {
        this.name = name;
        this.code = code;
        this.category = category;
        this.amount = amount;
        this.addedBy = addedBy;
        this.vendor = vendor;
    }
}
