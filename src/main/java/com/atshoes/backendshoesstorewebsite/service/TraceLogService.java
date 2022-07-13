package com.atshoes.backendshoesstorewebsite.service;


import com.atshoes.backendshoesstorewebsite.model.TraceLog;
import org.aspectj.weaver.tools.Trace;

import java.util.List;

public interface TraceLogService {

    public List<TraceLog> getAll();

    public TraceLog getById(int id);

    public TraceLog save(TraceLog traceLog);

    public TraceLog update(TraceLog traceLog, int id);

    public boolean delete(int id, boolean del_flg);
}
