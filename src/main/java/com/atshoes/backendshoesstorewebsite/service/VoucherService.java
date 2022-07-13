package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.Voucher;

import java.util.List;

public interface VoucherService {
    public List<Voucher> getAll();

    public Voucher getById(int id);

    public Voucher save(Voucher voucher);

    public Voucher update(Voucher voucher, int id);

    public boolean delete(int id, boolean del_flg);
}
