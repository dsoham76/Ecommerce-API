package com.example.Ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String description;
    private String category;
    private String brand;
}
