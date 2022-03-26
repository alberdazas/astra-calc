package com.astra.calc.controller;

import com.astra.calc.entity.Project;
import com.astra.calc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public String listProjects(Model model) {
        List<Project> projectList = projectService.findAll();
        model.addAttribute("projects", projectList);
        return "projects/list-projects";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
//        create model attribute to bind form data
        Project project = new Project();
        model.addAttribute("project", project);
        return "projects/project-form";
    }

    @PostMapping("/save")
    public String saveProject(@ModelAttribute ("project") Project project){
//        save project
        projectService.save(project);
//        redirect to prevent duplicate submissions
        return "redirect:/projects/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("projectId") int id, Model model) {
//        get project from service
        Project project = projectService.findById(id);
//        get project as model attribute to repopulate form
        model.addAttribute("project", project);
//        send to our form
        return "/projects/project-form";
    }


    @GetMapping("/deleteForm")
    public String deleteForm(@RequestParam("projectId") int id) {
        projectService.deleteById(id);
        return "redirect:/projects/list";
    }
}
