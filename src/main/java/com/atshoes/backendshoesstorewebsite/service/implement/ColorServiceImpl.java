package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Color;
import com.atshoes.backendshoesstorewebsite.service.ColorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Override
    public List<Color> getAll() {
        return null;
    }

    @Override
    public Color getById(int id) {
        return null;
    }

    @Override
    public Color save(Color color) {
        return null;
    }

    @Override
    public Color update(Color color, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
