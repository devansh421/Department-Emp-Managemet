package com.Divyanshu.services;

import java.util.List;

import com.Divyanshu.models.Department;

public interface DepartmentService 
{
	List<Department> getList();
	void saveRecord(Department dept);
	void deleteRecord(int did);
	Department getRecord(int did);
	void updateRecord(Department dept);
}
