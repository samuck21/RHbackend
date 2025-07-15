package com.svstudio.RHbackend.repository;

import com.svstudio.RHbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
