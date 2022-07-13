package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Shoes;
import com.atshoes.backendshoesstorewebsite.repository.ShoesRepository;
import com.atshoes.backendshoesstorewebsite.service.ShoesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoesServiceImpl implements ShoesService {
    @Override
    public List<Shoes> getAll() {
        return null;
    }

    @Override
    public Shoes getById(int id) {
        return null;
    }

    @Override
    public Shoes save(Shoes shoes) {
        return null;
    }

    @Override
    public Shoes update(Shoes shoes, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
