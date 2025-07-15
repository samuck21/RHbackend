package com.svstudio.RHbackend.service;

import com.svstudio.RHbackend.model.Employee;

import java.util.List;

public interface IEmployeeService  {
    public List<Employee> employeeList();
    public Employee findEmployeeById(Integer idEmployee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);

}
