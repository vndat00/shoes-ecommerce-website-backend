package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.ShippingCompany;

import java.util.List;

public interface ShippingCompanyService {
    public List<ShippingCompany> getAll();

    public ShippingCompany getById(int id);

    public ShippingCompany save(ShippingCompany shippingCompany);

    public ShippingCompany update(ShippingCompany shippingCompany, int id);

    public boolean delete(int id, boolean del_flg);
}