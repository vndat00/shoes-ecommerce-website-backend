package com.atshoes.backendshoesstorewebsite.model;

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
@Table(name = "shipping_companies")
public class ShippingCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_company_id")
    private int shippingCompanyId;

    @Column(name = "shipping_company_name")
    private String shippingCompanyName;

    @Column
    private boolean delete_flg;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingCompany")
    private List<Order> orders = new ArrayList<>();

}
