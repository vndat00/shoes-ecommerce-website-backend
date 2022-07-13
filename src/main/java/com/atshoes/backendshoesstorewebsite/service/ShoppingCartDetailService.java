package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.ShoppingCartDetail;

import java.util.List;

public interface ShoppingCartDetailService {
    public List<ShoppingCartDetail> getAll();

    public ShoppingCartDetail getById(int id);

    public ShoppingCartDetail save(ShoppingCartService shoppingCartService);

    public ShoppingCartDetail update(ShoppingCartDetail shoppingCartDetail,int id);

    public boolean delete(int id, boolean del_flg);
}
