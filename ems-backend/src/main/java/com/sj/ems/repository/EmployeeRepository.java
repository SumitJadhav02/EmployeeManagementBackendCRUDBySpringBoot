package com.sj.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.ems.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
