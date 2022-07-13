package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.Color;

import java.util.List;

public interface ColorService {
    public List<Color> getAll();

    public Color getById(int id);

    public Color save(Color color);

    public Color update(Color color, int id);

    public boolean delete(int id, boolean del_flg);
}
