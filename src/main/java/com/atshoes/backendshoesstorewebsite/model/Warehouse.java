package com.atshoes.backendshoesstorewebsite.model;

import com.atshoes.backendshoesstorewebsite.model.compositekey.WarehouseKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "warehouse")
public class Warehouse {
    @EmbeddedId
    private WarehouseKey id;

    @ManyToOne
    @MapsId("shoesId")
    @JoinColumn(name = "shoes_id")
    private Shoes shoes;

    @ManyToOne
    @MapsId("sizeId")
    @JoinColumn(name = "size_id")
    private Size size;

    @Column
    private int amount;

    @Column
    private boolean delete_flg;

}
