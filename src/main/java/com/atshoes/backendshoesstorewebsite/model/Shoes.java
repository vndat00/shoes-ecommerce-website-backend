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
@Table( name = "shoes")
public class Shoes {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "shoes_id")
    private int shoesId;

    @Column( name = "shoes_name")
    private String shoesName;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn( name = "shoes_state_id", nullable = false)
    private ShoesState shoesState;

    @Column( name = "receipt_date")
    private Date receiptDate;

    @Column( name = "receipt_price")
    private double receiptPrice;

    @Column( name = "sale_off_index")
    private double saleOffIndex;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    private Color color;

    @Column
    private String description;

    @Column
    private boolean delete_flg;

    @Column
    private boolean ready_flg;

    @OneToMany(mappedBy = "shoes", cascade = CascadeType.ALL)
    private List<Warehouse> warehouses = new ArrayList<>();

    @OneToMany(mappedBy = "shoes", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();

    @OneToMany(mappedBy = "shoes", cascade = CascadeType.ALL)
    private List<ShoppingCartDetail> shoppingCartDetails = new ArrayList<>();




}
