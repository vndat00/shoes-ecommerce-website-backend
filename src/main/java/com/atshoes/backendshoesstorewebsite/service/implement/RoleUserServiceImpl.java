package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.RoleUser;
import com.atshoes.backendshoesstorewebsite.service.RoleUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Override
    public List<RoleUser> getAll() {
        return null;
    }

    @Override
    public RoleUser getById(int id) {
        return null;
    }

    @Override
    public RoleUser save(RoleUser roleUser) {
        return null;
    }

    @Override
    public RoleUser update(RoleUser roleUser, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
