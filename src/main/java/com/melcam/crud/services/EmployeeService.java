package com.melcam.crud.services;

import com.melcam.crud.models.Employee;

import java.util.List;

public interface EmployeeService {
    Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(Long id);

    void save(Employee contact);

    void delete(Long id);
}
