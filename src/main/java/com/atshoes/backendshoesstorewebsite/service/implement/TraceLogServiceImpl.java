package com.atshoes.backendshoesstorewebsite.service.implement;

import com.atshoes.backendshoesstorewebsite.model.TraceLog;
import com.atshoes.backendshoesstorewebsite.repository.TraceLogRepository;
import com.atshoes.backendshoesstorewebsite.service.TraceLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceLogServiceImpl implements TraceLogService {
    @Override
    public List<TraceLog> getAll() {
        return null;
    }

    @Override
    public TraceLog getById(int id) {
        return null;
    }

    @Override
    public TraceLog save(TraceLog traceLog) {
        return null;
    }

    @Override
    public TraceLog update(TraceLog traceLog, int id) {
        return null;
    }

    @Override
    public boolean delete(int id, boolean del_flg) {
        return false;
    }
}
