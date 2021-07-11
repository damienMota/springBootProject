package net.javaguides.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    
}
