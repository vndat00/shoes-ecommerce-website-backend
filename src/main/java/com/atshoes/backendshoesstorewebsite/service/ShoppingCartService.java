package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    public List<ShoppingCart> getAll();

    public ShoppingCart getById(int id);

    public ShoppingCart save(ShoppingCart shoppingCart);

    public ShoppingCart update(ShoppingCart shoppingCart, int id);

    public boolean delete(int id, boolean del_flg);
}
