package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.Order;
import com.atshoes.backendshoesstorewebsite.model.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    public List<OrderDetail>  getAll();

    public OrderDetail getById(int id);

    public OrderDetail save(OrderDetail orderDetail);

    public OrderDetail update(OrderDetail orderDetail, int id);

    public boolean delete(int id, boolean del_flg);
}
