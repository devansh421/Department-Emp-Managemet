package com.Divyanshu.repositories;

import java.util.List;

import com.Divyanshu.models.Department;

public interface DepartmentRepository 
{
	List<Department> getDepartmentList();
	void sabeDepartment(Department dept);
	void deleteDepartment(int did);
	Department getDepartment(int did);
	void updateDepartment(Department odept, Department ndept);
	void increaseTotalEmployees(int did);
	void decreaseTotalEmployees(int did);
	void updateTotalEmployees(int odid, int ndid);
}
