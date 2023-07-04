package com.melcam.crud.repository;

import com.melcam.crud.models.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByNameContaining(String name);

    @Query(value = "select *from  table", nativeQuery = true)
    public void buscarNombre();
}
