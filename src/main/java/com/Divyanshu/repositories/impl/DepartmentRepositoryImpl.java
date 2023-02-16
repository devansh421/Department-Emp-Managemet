package com.Divyanshu.repositories.impl;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.Department;
import com.Divyanshu.repositories.DepartmentRepository;
import com.Divyanshu.session.ProjectSession;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public DepartmentRepositoryImpl(ProjectSession ps)
	{
		ses=ps.getSession();
		t=ses.getTransaction();
	}
	public List<Department> getDepartmentList() 
	{
		Query<Department> q=ses.createQuery("from Department");
		List<Department> dlist=q.list();
		return dlist;
	}
	public void sabeDepartment(Department dept) 
	{
		t.begin();
		ses.save(dept);
		t.commit();
	}
	public void deleteDepartment(int did) 
	{
		Department dd=ses.get(Department.class,did);
		t.begin();
		ses.delete(dd);
		t.commit();
	}
	public Department getDepartment(int did) 
	{
		Department dd=ses.get(Department.class,did);
		return dd;
	}
	public void updateDepartment(Department odept, Department ndept) 
	{
		t.begin();
		odept.setName(ndept.getName());
		odept.setHead(ndept.getHead());
		t.commit();
	}
	public void increaseTotalEmployees(int did) 
	{
		t.begin();
		Department d=ses.get(Department.class,did);
		d.setTotalEmployees(d.getTotalEmployees()+1);
		t.commit();
	}
	public void decreaseTotalEmployees(int did) 
	{
		t.begin();
		Department d=ses.get(Department.class,did);
		d.setTotalEmployees(d.getTotalEmployees()-1);
		t.commit();
	}
	public void updateTotalEmployees(int odid, int ndid) 
	{
		t.begin();
		Department od=ses.get(Department.class,odid);
		od.setTotalEmployees(od.getTotalEmployees()-1);
		Department nd=ses.get(Department.class,ndid);
		nd.setTotalEmployees(nd.getTotalEmployees()+1);
		t.commit();
	}
}
