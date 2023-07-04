package com.melcam.crud.services;

import com.melcam.crud.models.Employee;
import com.melcam.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> search(String q) {
        return employeeRepository.findByNameContaining(q);
    }

    @Override
    public Employee findOne(Long id) {
        return employeeRepository.findById(id).orElse(null);

    }

    @Override
    public void save(Employee contact) {
        employeeRepository.save(contact);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
