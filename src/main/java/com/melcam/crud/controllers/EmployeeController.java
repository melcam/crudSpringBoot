package com.melcam.crud.controllers;

import com.melcam.crud.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String index(Model model) {

        model.addAttribute("employees", employeeService.findAll());
        return "list";
    }

}
