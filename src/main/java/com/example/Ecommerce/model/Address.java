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
public class Address {
    @Id
    private Integer id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

}
