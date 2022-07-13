package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.PaymentMethod;
import com.atshoes.backendshoesstorewebsite.service.PaymentMethodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
    @Override
    public List<PaymentMethod> getAll() {
        return null;
    }

    @Override
    public PaymentMethod getById(int id) {
        return null;
    }

    @Override
    public PaymentMethod save(PaymentMethod paymentMethod) {
        return null;
    }

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
