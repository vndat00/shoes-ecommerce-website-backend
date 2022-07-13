package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.controller.WarehouseController;
import com.atshoes.backendshoesstorewebsite.model.Warehouse;
import com.atshoes.backendshoesstorewebsite.model.compositekey.WarehouseKey;

import java.util.List;
import java.util.Optional;

public interface WarehouseService {
    public List<Warehouse> getAll();

    public Warehouse getById(WarehouseKey id);

    public Warehouse save(Warehouse warehouse);

    public Warehouse update(Warehouse warehouse, int id);

    public boolean delete(int id, boolean del_flg);

}
