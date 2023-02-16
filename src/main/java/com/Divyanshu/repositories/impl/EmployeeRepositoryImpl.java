package com.Divyanshu.repositories.impl;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.Employee;
import com.Divyanshu.repositories.EmployeeRepository;
import com.Divyanshu.session.ProjectSession;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public EmployeeRepositoryImpl(ProjectSession ps)
	{
		ses=ps.getSession();
		t=ses.getTransaction();
	}
	public List<Employee> getEmployeeList() 
	{
		Query<Employee> q=ses.createQuery("from Employee");
		List<Employee> elist=q.list();
		return elist;
	}
	public void saveEmployee(Employee emp) 
	{
		t.begin();
		ses.save(emp);
		t.commit();
	}
	public Employee getEmployee(int eid) 
	{
		Employee emp=ses.get(Employee.class,eid);
		return emp;
	}
	public void deleteEmployee(Employee emp) 
	{
		t.begin();
		ses.delete(emp);
		t.commit();
	}
	public void updateEmployee(Employee oemp, Employee nemp) 
	{
		t.begin();
		oemp.setFirstname(nemp.getFirstname());
		oemp.setLastname(nemp.getLastname());
		oemp.setDob(nemp.getDob());
		oemp.setPhone(nemp.getPhone());
		oemp.setSalary(nemp.getSalary());
		oemp.setDid(nemp.getDid());
		t.commit();
	}
}
