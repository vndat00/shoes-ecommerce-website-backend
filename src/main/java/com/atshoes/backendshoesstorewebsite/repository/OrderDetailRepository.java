package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.OrderDetail;
import com.atshoes.backendshoesstorewebsite.model.compositekey.OrderDetailKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailKey> {
}
