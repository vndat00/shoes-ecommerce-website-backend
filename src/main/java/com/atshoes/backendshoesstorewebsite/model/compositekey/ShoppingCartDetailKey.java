package com.atshoes.backendshoesstorewebsite.model.compositekey;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class ShoppingCartDetailKey implements Serializable {
    @Column(name = "shoes_id")
    private int shoesId;

    @Column(name = "shopping_cart_id")
    private int shoppingCartId;

}
