package com.Divyanshu.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Employee;
import com.Divyanshu.repositories.DepartmentRepository;
import com.Divyanshu.repositories.EmployeeRepository;
import com.Divyanshu.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired private EmployeeRepository repo;
	@Autowired private DepartmentRepository drepo;
	public List<Employee> getList() 
	{
		return repo.getEmployeeList();
	}
	public void saveRecord(Employee emp,String date) 
	{
		LocalDate ld=LocalDate.parse(date);
		emp.setDob(ld);
		repo.saveEmployee(emp);
		drepo.increaseTotalEmployees(emp.getDid());
	}
	public void deleteRecord(int eid) 
	{
		Employee emp=repo.getEmployee(eid);
		repo.deleteEmployee(emp);
		drepo.decreaseTotalEmployees(emp.getDid());
	}
	public Employee getRecord(int eid) 
	{
		return repo.getEmployee(eid);
	}
	public void updateRecord(Employee nemp, String date) 
	{
		Employee oemp=repo.getEmployee(nemp.getEid());
		int odid=oemp.getDid();
		int ndid=nemp.getDid();
		LocalDate ld=LocalDate.parse(date);
		nemp.setDob(ld);
		repo.updateEmployee(oemp,nemp);
		if(odid!=ndid)
		{
			drepo.updateTotalEmployees(odid,ndid);
		}
	}
}
