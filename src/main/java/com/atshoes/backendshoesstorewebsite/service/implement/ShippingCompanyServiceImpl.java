package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.ShippingCompany;
import com.atshoes.backendshoesstorewebsite.repository.ShippingCompanyRepository;
import com.atshoes.backendshoesstorewebsite.service.ShippingCompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingCompanyServiceImpl implements ShippingCompanyService {
    @Override
    public List<ShippingCompany> getAll() {
        return null;
    }

    @Override
    public ShippingCompany getById(int id) {
        return null;
    }

    @Override
    public ShippingCompany save(ShippingCompany shippingCompany) {
        return null;
    }

    @Override
    public ShippingCompany update(ShippingCompany shippingCompany, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
