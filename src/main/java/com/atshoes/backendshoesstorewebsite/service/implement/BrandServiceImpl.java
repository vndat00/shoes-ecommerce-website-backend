package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Brand;
import com.atshoes.backendshoesstorewebsite.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Override
    public List<Brand> getall() {
        return null;
    }

    @Override
    public Brand getById(int id) {
        return null;
    }

    @Override
    public Brand save(Brand brand) {
        return null;
    }

    @Override
    public Brand update(Brand brand, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
