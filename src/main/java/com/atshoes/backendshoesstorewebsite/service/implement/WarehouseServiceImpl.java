package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Warehouse;
import com.atshoes.backendshoesstorewebsite.model.compositekey.WarehouseKey;
import com.atshoes.backendshoesstorewebsite.repository.WarehouseRepository;
import com.atshoes.backendshoesstorewebsite.service.WarehouseService;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;
    @Override
    public List<Warehouse> getAll() {
        return warehouseRepository.findAll();
    }

    @Override
    public Warehouse getById(WarehouseKey id) {
        Optional<Warehouse> warehouse = warehouseRepository.findById(id);
        if(warehouse.isEmpty()){
            System.out.println("ko tim thay warehouse: "+id);
            return null;
        }else{
            Warehouse  newWareHouse = warehouse.get();
            return newWareHouse;
        }
    }

    @Override
    public Warehouse save(Warehouse warehouse) {
        Optional<Warehouse> warehouseOpt  = warehouseRepository.findById(warehouse.getId());
        if(warehouseOpt.isPresent()){
            System.out.println("da co warehouse: "+ warehouse.getId());
            return null;
        }else {
            Warehouse newWarehouse  = warehouseOpt.get();
            return warehouseRepository.save(newWarehouse);
        }
    }

    @Override
    public Warehouse update(Warehouse warehouse, int id) {
        Optional<Warehouse> warehouseOpt = warehouseRepository.findById(id);
        if(warehouseOpt.isEmpty()){
            System.out.println("ko co warehouse:" +id);
            return null;
        }else{
            Warehouse newWarehouse = warehouseOpt.get();
            newWarehouse.setAmount(warehouse.getAmount());
            newWarehouse.setShoes(warehouse.getShoes());
            newWarehouse.setSize(warehouse.getSize());
            newWarehouse.setDelete_flg(warehouse.isDelete_flg());
            return warehouseRepository.save(newWarehouse);
        }
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        Optional<Warehouse> warehouseOpt = warehouseRepository.findById(id);
        if(warehouseOpt.isEmpty()){
            System.out.println("ko co warehouse:" + id);
            return false;
        }else {
            Warehouse warehouse = warehouseOpt.get();
            if (del_flg == false){
                warehouse.setDelete_flg(del_flg);
                return false;
            }else{
                warehouse.setDelete_flg(del_flg);
                return true;
            }
        }
    }
}
