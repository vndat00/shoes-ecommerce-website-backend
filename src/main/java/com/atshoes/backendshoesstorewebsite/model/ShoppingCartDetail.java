package com.atshoes.backendshoesstorewebsite.model;

import com.atshoes.backendshoesstorewebsite.model.compositekey.ShoppingCartDetailKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shopping_cart_details")
public class ShoppingCartDetail {
    @EmbeddedId
    ShoppingCartDetailKey id;

    @ManyToOne
    @MapsId("shoesId")
    @JoinColumn( name = "shoes_id")
    private Shoes shoes;

    @JsonIgnore
    @ManyToOne
    @MapsId("shoppingCartId")
    @JoinColumn( name = "shopping_cart_id")
    private ShoppingCart shoppingCart;

    @Column
    private int quantity;
}
