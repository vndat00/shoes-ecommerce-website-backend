package com.atshoes.backendshoesstorewebsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonComponent;

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

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingCompany")
    private List<Order> orders = new ArrayList<>();

}
