package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.RoleUser;

import java.util.List;

public interface RoleUserService {
    public List<RoleUser> getAll();

    public RoleUser getById(int id);

    public RoleUser save(RoleUser roleUser);

    public RoleUser update(RoleUser roleUser, int id);

    public boolean delete(int id, boolean del_flg);
}
