package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.ShoppingCartDetail;
import com.atshoes.backendshoesstorewebsite.model.compositekey.ShoppingCartDetailKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartDetailRepository extends JpaRepository<ShoppingCartDetail, ShoppingCartDetailKey> {
}
