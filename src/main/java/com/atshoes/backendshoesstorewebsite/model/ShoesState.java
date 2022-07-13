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
@Table(name = "shoes_states")
public class ShoesState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shoes_state_id")
    private int shoesStateId;

    @Column(name = "shoes_state_name")
    private String shoesStateName;

    @Column
    private boolean delete_flg;

    @JsonIgnore
    @OneToMany( cascade = CascadeType.ALL, mappedBy = "shoesState")
    private List<Shoes> shoes = new ArrayList<>();

    public ShoesState(String shoesStateName, boolean delete_flg) {
        this.shoesStateName = shoesStateName;
        this.delete_flg = delete_flg;
    }
}
