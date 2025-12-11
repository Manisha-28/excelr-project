package com.ems.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.user.entity.Employee;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByEmail(String email);
}
