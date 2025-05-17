package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeDTO dto) {
        Employee emp = new Employee();
        emp.setName(dto.name);
        emp.setSalary(dto.salary);
        return employeeRepository.save(emp);
    } 
     
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO dto) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(dto.name);
            emp.setSalary(dto.salary);
            return employeeRepository.save(emp);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
