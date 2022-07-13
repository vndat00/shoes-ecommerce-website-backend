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
public class OrderDetailKey implements Serializable {
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "shoes_id")
    private int shoesId;
}
