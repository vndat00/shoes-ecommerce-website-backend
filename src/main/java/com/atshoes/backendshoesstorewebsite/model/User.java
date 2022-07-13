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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column
    private String phonenumber;

    @Column
    private String password;

    @Column
    private boolean enabled;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL )
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ImportCSVHistory> importCSVHistories = new ArrayList<>();

    @OneToOne(mappedBy = "user")
    private TraceLog traceLog;

    @OneToOne(mappedBy = "user")
    private ShoppingCart shoppingCart;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RoleUser> roleUsers = new ArrayList<>();
}
