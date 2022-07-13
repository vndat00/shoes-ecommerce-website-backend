package com.atshoes.backendshoesstorewebsite.model;

import com.atshoes.backendshoesstorewebsite.model.compositekey.RoleUserKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles_users")
public class RoleUser {
    @EmbeddedId
    private RoleUserKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn( name = "role_id")
    private Role role;

    @JsonIgnore
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private boolean delete_flg;

}

