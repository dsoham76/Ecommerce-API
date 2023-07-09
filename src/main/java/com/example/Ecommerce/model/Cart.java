package com.example.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cart {
    @Id
    private Integer id;
    private Integer productQuantity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_user_id")
    private User user;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_id")
    private Product product;

}
