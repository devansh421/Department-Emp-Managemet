package com.Divyanshu.repositories;

import java.util.List;

import com.Divyanshu.models.Employee;

public interface EmployeeRepository 
{
	List<Employee> getEmployeeList();
	void saveEmployee(Employee emp);
	Employee getEmployee(int eid);
	void deleteEmployee(Employee emp);
	void updateEmployee(Employee oemp, Employee nemp);
}
