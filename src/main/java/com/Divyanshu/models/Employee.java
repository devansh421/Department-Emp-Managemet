package com.Divyanshu.models;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "employeeinfo")
public class Employee 
{
	@Id
	@GeneratedValue(generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq",initialValue = 11111,allocationSize = 1)
	private int eid;
	@Column(length = 20)
	private String firstname;
	@Column(length = 20)
	private String lastname;
	@Column(length = 30)
	private LocalDate dob;
	@Column(length = 20)
	private String phone;
	private int salary;
	private int did;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
