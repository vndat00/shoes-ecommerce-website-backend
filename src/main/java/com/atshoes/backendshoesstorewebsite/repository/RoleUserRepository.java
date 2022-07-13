package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.RoleUser;
import com.atshoes.backendshoesstorewebsite.model.compositekey.RoleUserKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserRepository extends JpaRepository<RoleUser, RoleUserKey> {
}
