package com.atshoes.backendshoesstorewebsite.repository;

import com.atshoes.backendshoesstorewebsite.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Size, Integer> {
}
