package com.atshoes.backendshoesstorewebsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "order_id")
    private int orderId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private Date date;

    @Column
    private String address;

    @Column(name = "total_bill")
    private double totalBill;

    @ManyToOne
    @JoinColumn( name = "voucher_id", nullable = false)
    private Voucher voucher;

    @ManyToOne
    @JoinColumn( name = "payment_method_id", nullable = false)
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "shipping_company_id", nullable = false)
    private ShippingCompany shippingCompany;

    @OneToMany( mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();

    @Column
    private boolean delete_flg;

}
