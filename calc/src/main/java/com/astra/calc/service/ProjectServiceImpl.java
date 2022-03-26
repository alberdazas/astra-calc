package com.astra.calc.service;

import com.astra.calc.dao.ProjectRepository;
import com.astra.calc.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findById(int id) {
        Optional<Project> result = projectRepository.findById(id);
        Project project = null;
        if(result.isPresent()){
            project = result.get();
        } else {
            throw  new RuntimeException("Haven't found: " + id);
        }
        return project;
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void deleteById(int id) {
        projectRepository.deleteById(id);
    }
}
