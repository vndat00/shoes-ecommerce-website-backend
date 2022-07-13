package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.Shoes;

import java.util.List;

public interface ShoesService {
    public List<Shoes> getAll();

    public Shoes getById(int id);

    public Shoes save(Shoes shoes);

    public Shoes update(Shoes shoes, int id);

    public boolean delete(int id, boolean del_flg);
}
