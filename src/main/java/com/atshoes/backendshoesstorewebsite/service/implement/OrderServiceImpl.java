package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Order;
import com.atshoes.backendshoesstorewebsite.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order getById(int id) {
        return null;
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Order order, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
