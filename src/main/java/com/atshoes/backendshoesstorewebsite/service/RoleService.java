package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.Role;

import java.util.List;

public interface RoleService {

    public List<Role> getAll();

    public Role getById(int id);

    public Role save(Role role);

    public Role update( Role role, int id);

    public boolean delete(int id, boolean del_flg);
}
