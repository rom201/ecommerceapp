package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cart_item")
public class CartItem extends BaseEntity{

    private int quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;


}
