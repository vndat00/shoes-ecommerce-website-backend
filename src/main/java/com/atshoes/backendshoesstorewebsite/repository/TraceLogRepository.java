package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.TraceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceLogRepository extends JpaRepository<TraceLog, Integer> {
}
