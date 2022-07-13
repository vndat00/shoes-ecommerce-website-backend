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
@Table( name = "brands")
public class Brand {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "brand_id")
    private int brandId;

    @Column( name = "brand_name")
    private String brandName;

    @Column
    private boolean delete_flg;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Shoes> shoes = new ArrayList<>();

    public Brand(String brandName, boolean delete_flg, List<Shoes> shoes) {
        this.brandName = brandName;
        this.delete_flg = delete_flg;
        this.shoes = shoes;
    }

    public Brand(String brandName, boolean delete_flg) {
        this.brandName = brandName;
        this.delete_flg = delete_flg;
    }
}
