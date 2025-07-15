package com.svstudio.RHbackend.service;

import com.svstudio.RHbackend.model.Employee;
import com.svstudio.RHbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService implements  IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> employeeList() {
        return  employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Integer idEmployee) {
        return employeeRepository.findById(idEmployee).orElse(null);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
