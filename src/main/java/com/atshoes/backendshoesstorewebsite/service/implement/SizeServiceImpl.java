package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Size;
import com.atshoes.backendshoesstorewebsite.service.SizeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
    @Override
    public List<Size> getAll() {
        return null;
    }

    @Override
    public Size getById(int id) {
        return null;
    }

    @Override
    public Size save(Size size) {
        return null;
    }

    @Override
    public Size update(Size size, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
