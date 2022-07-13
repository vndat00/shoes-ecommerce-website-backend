package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> getall();

    public Brand getById(int id);

    public Brand save(Brand brand);

    public Brand update(Brand brand, int id);

    public boolean delete(int id, boolean del_flg);
}
