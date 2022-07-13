package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    public List<PaymentMethod> getAll();

    public PaymentMethod getById(int id);

    public PaymentMethod save( PaymentMethod paymentMethod);

    public PaymentMethod update(PaymentMethod paymentMethod, int id);

    public boolean delete(int id, boolean del_flg);
}