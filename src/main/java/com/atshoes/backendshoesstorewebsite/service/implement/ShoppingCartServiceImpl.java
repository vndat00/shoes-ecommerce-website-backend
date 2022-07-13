package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.ShoppingCart;
import com.atshoes.backendshoesstorewebsite.service.ShippingCompanyService;
import com.atshoes.backendshoesstorewebsite.service.ShoppingCartDetailService;
import com.atshoes.backendshoesstorewebsite.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Override
    public List<ShoppingCart> getAll() {
        return null;
    }

    @Override
    public ShoppingCart getById(int id) {
        return null;
    }

    @Override
    public ShoppingCart save(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
