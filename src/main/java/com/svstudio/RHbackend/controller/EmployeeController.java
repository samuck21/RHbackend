package com.svstudio.RHbackend.controller;

import com.svstudio.RHbackend.model.Employee;
import com.svstudio.RHbackend.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/rh-app/employees
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmployeeController {
    private static final Logger  logger=
            LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        var employees = employeeService.employeeList();
        employees.forEach(employee -> logger.info(employee.toString()));
        return employees;
    }

}
