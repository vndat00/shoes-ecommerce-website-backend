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
@Table( name = "sizes")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private int sizeId;

    @Column(name = "size_name")
    private String sizeName;

    @Column
    private boolean delete_flg;

    @OneToMany(mappedBy = "size", cascade = CascadeType.ALL)
    private List<Warehouse> warehouses = new ArrayList<>();

    public Size(String sizeName, boolean delete_flg) {
        this.sizeName = sizeName;
        this.delete_flg = delete_flg;
    }
}
