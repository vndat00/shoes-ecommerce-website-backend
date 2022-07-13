package com.atshoes.backendshoesstorewebsite.model.compositekey;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class RoleUserKey implements Serializable {
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "user_id")
    private int userId;
}
