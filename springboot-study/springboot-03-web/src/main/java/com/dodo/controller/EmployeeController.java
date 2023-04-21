package com.dodo.controller;

import com.dodo.dao.EmployeeDao;
import com.dodo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model){
        final Collection<Employee> allEmployee = employeeDao.getAllEmployee();
        model.addAttribute("emps", allEmployee);
        return "emp/list";

    }

    @GetMapping("/emp")
    public String toAddpage(){
        return "emp/add";
    }



}