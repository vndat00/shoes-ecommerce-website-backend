package com.atshoes.backendshoesstorewebsite.model;

import com.atshoes.backendshoesstorewebsite.model.compositekey.OrderDetailKey;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailKey id;

    @ManyToOne
    @MapsId("shoesId")
    @JoinColumn(name = "shoes_id")
    private Shoes shoes;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @Column
    private int quantity;

    @Column
    private boolean delete_flg;
}
