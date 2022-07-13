package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public User getById(int id);

    public User save( User user);

    public User update( User user, int id);

    public boolean delete(int id, boolean del_flg);
}
