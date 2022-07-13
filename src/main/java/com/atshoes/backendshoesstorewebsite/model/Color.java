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
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private int colorId;

    @Column( name = "color_name")
    private String colorName;

    @Column
    private boolean delete_flg;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "color")
    private List<Shoes> shoes = new ArrayList<>();

    public Color(String colorName, boolean delete_flg, List<Shoes> shoes) {
        this.colorName = colorName;
        this.delete_flg = delete_flg;
        this.shoes = shoes;
    }

    public Color(String colorName, boolean delete_flg) {
        this.colorName = colorName;
        this.delete_flg = delete_flg;
    }
}
