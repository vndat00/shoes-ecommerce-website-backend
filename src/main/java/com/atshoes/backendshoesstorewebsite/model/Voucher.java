package com.atshoes.backendshoesstorewebsite.model;

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
@Table(name = "vouchers")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucher_id")
    private int voucherId;

    @Column(name = "voucher_name")
    private String voucherName;

    @Column(name = "voucher_value")
    private double voucherValue;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "voucher_quantity")
    private int voucherQuantity;

    @Column
    private boolean delete_flg;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "voucher")
    private List<Order> orders = new ArrayList<>();

}
