package com.Divyanshu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="departmentinfo")
public class Department 
{
	@Id
	@GeneratedValue(generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq",initialValue = 111,allocationSize = 1)
	private int did;
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String head;
	private int totalEmployees;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public int getTotalEmployees() {
		return totalEmployees;
	}
	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}
	
}
