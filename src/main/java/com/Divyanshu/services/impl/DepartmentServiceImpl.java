package com.Divyanshu.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Department;
import com.Divyanshu.repositories.DepartmentRepository;
import com.Divyanshu.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService 
{
	@Autowired private DepartmentRepository repo;

	public List<Department> getList() 
	{
		return repo.getDepartmentList();
	}
	public void saveRecord(Department dept) 
	{
		repo.sabeDepartment(dept);
	}
	public void deleteRecord(int did) 
	{
		repo.deleteDepartment(did);
	}
	public Department getRecord(int did) 
	{
		return repo.getDepartment(did);
	}
	public void updateRecord(Department ndept) 
	{
		Department odept=repo.getDepartment(ndept.getDid());
		repo.updateDepartment(odept,ndept);
	}
}
