package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.DetailHistory;
import com.atshoes.backendshoesstorewebsite.service.DetailHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailHistoryServiceImpl implements DetailHistoryService {
    @Override
    public List<DetailHistory> getAll() {
        return null;
    }

    @Override
    public DetailHistory getById(int id) {
        return null;
    }

    @Override
    public DetailHistory save(int id) {
        return null;
    }

    @Override
    public DetailHistory update(DetailHistory detailHistory, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
