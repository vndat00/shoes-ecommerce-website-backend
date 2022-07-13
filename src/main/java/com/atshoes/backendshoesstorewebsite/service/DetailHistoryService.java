package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.DetailHistory;

import java.util.List;

public interface DetailHistoryService {

    public List<DetailHistory> getAll();

    public DetailHistory getById(int id);

    public DetailHistory save(int id);

    public DetailHistory update(DetailHistory detailHistory, int id);

    public boolean delete(int id, boolean del_flg);
}