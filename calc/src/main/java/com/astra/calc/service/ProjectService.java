package com.astra.calc.service;

import com.astra.calc.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    Project findById(int id);
    void save(Project project);
    void deleteById(int id);
}
