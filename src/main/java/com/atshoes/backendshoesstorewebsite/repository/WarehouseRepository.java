package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.Warehouse;
import com.atshoes.backendshoesstorewebsite.model.compositekey.WarehouseKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, WarehouseKey>{
}