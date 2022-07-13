package com.atshoes.backendshoesstorewebsite.service;

import com.atshoes.backendshoesstorewebsite.model.ImportCSVHistory;

import java.util.List;

public interface ImportCSVHistoryService {

    public List<ImportCSVHistory> getAll();

    public ImportCSVHistory getById(int id);

    public ImportCSVHistory save(ImportCSVHistory importCSVHistory);

    public ImportCSVHistory update(ImportCSVHistory importCSVHistory, int id);

    public boolean delete(int id, boolean del_flg);
}
