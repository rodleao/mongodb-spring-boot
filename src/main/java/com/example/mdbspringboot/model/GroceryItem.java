package com.example.mdbspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class GroceryItem {
    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;
}
