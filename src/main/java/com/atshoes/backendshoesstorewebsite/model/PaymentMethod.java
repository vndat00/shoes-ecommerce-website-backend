package com.atshoes.backendshoesstorewebsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payment_methods")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_method_id")
    private int paymentMethodId;

    @Column(name = "payment_method_name")
    private String paymentMethodName;

    @Column
    private boolean delete_flg;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private List<Order> orders = new ArrayList<>();
}
