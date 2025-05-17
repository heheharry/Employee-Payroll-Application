package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import java.util.*;

public interface EmployeeService {
    Employee createEmployee(EmployeeDTO dto);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, EmployeeDTO dto);
    void deleteEmployee(int id);
}
