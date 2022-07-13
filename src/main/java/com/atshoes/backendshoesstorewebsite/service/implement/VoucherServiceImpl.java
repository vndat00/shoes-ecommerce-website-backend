package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Voucher;
import com.atshoes.backendshoesstorewebsite.repository.VoucherRepository;
import com.atshoes.backendshoesstorewebsite.service.VoucherService;
import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoucherServiceImpl implements VoucherService {

    @Autowired
    private VoucherRepository voucherRepository;
    @Override
    public List<Voucher> getAll() {
        return voucherRepository.findAll();
    }

    @Override
    public Voucher getById(int id) {
        Optional<Voucher> voucherOpt = voucherRepository.findById(id);
        if(voucherOpt.isEmpty()){
            System.out.println(" ko cos ma giam gia: "+ id);
            return null;
        }else{
            Voucher voucher = voucherOpt.get();
            return voucher;
        }
    }

    @Override
    public Voucher save(Voucher voucher) {
        Optional<Voucher> voucherOpt = voucherRepository.findById(voucher.getVoucherId());
        if(voucherOpt.isPresent()){
            System.out.println("Da co ma giam gia nay");
            return null;
        }else{
            Voucher newVoucher  = voucherOpt.get();
            return voucherRepository.save(newVoucher);
        }
    }

    @Override
    public Voucher update(Voucher voucher, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
