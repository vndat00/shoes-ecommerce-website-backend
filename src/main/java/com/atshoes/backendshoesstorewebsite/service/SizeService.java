package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.Size;

import java.util.List;

public interface SizeService {

    public List<Size> getAll();

    public Size getById(int id);

    public Size save(Size size);

    public Size update(Size size, int id);

    public boolean delete(int id, boolean del_flg);
}
