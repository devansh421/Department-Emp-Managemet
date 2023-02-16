package com.Divyanshu.services;

import java.util.List;

import com.Divyanshu.models.Employee;

public interface EmployeeService 
{
	List<Employee> getList();
	void saveRecord(Employee emp,String date);
	void deleteRecord(int eid);
	Employee getRecord(int eid);
	void updateRecord(Employee emp, String date);
}
