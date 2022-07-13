package com.atshoes.backendshoesstorewebsite.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    @Column
    private String name;

    @Column
    private boolean delete_flg;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<RoleUser> roleUsers = new ArrayList<>();
}
