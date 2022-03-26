package com.astra.calc.dao;

import com.astra.calc.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAllByOrderByIdAsc();
}
