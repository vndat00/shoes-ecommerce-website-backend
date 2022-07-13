package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.ShoesState;
import com.atshoes.backendshoesstorewebsite.service.ShoesStateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoesStateServiceImpl implements ShoesStateService {
    @Override
    public List<ShoesState> getAll() {
        return null;
    }

    @Override
    public ShoesState getById(int id) {
        return null;
    }

    @Override
    public ShoesState save(ShoesState shoesState) {
        return null;
    }

    @Override
    public ShoesState update(ShoesState shoesState, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
