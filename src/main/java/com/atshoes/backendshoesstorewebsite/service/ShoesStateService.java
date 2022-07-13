package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.Shoes;
import com.atshoes.backendshoesstorewebsite.model.ShoesState;

import java.util.List;

public interface ShoesStateService {
    public List<ShoesState> getAll();

    public ShoesState getById(int id);

    public ShoesState save(ShoesState shoesState);

    public ShoesState update(ShoesState shoesState, int id);

    public boolean delete(int id, boolean del_flg);
}
