package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAll();

    public Order getById(int id);

    public Order save(Order order);

    public Order update(Order order, int id);

    public boolean delete(int id, boolean del_flg);
}
