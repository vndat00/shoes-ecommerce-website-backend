package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
}
