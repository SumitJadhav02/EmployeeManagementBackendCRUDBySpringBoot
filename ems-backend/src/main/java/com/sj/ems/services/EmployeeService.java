package com.sj.ems.services;

import java.util.List;

import com.sj.ems.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	EmployeeDto getEmployeeById(Long employeeId);
	List<EmployeeDto> getAllEmployees();
	void deleteById(Long employeeId);
	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
	

}
