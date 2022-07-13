package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.Role;
import com.atshoes.backendshoesstorewebsite.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role getById(int id) {
        return null;
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public Role update(Role role, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
