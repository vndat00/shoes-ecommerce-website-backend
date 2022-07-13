package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.ShoppingCartDetail;
import com.atshoes.backendshoesstorewebsite.service.ShoppingCartDetailService;
import com.atshoes.backendshoesstorewebsite.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartDetailServiceImpl implements ShoppingCartDetailService {
    @Override
    public List<ShoppingCartDetail> getAll() {
        return null;
    }

    @Override
    public ShoppingCartDetail getById(int id) {
        return null;
    }

    @Override
    public ShoppingCartDetail save(ShoppingCartService shoppingCartService) {
        return null;
    }

    @Override
    public ShoppingCartDetail update(ShoppingCartDetail shoppingCartDetail, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}