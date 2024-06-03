package com.thecodealchemist.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String code;
    private String category;
    private int amount;

    public ProductDTO(String name, String code, String category, int amount) {
        this.name = name;
        this.code = code;
        this.category = category;
        this.amount = amount;
    }
}
