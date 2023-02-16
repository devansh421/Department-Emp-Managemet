package com.Divyanshu.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Department;
import com.Divyanshu.models.Employee;
import com.Divyanshu.services.DepartmentService;
import com.Divyanshu.services.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired private EmployeeService service;
	@Autowired private DepartmentService dservice;
	
	@RequestMapping("employee/dashboard")
	public String getEmployeeDashboard(Model model)
	{
		List<Employee> list=service.getList();
		model.addAttribute("elist",list);
		return "employee/employee-list";
	}
	@RequestMapping("employee/add")
	public String getEmployeeAddView(Model model)
	{
		List<Department> list=dservice.getList();
		model.addAttribute("dlist",list);
		return "employee/save-employee";
	}
	@RequestMapping("employee/save-record")
	public String saveEmployeeRecord(Employee emp,String date)
	{
		service.saveRecord(emp,date);
		return "redirect:dashboard";
	}
	@RequestMapping("employee/delete-record")
	public String deleteEmployeeRecord(int eid)
	{
		service.deleteRecord(eid);
		return "redirect:dashboard";
	}
	@RequestMapping("employee/edit-record")
	public String editEmployeeRecord(int eid,Model model)
	{
		Employee emp=service.getRecord(eid);
		List<Department> list=dservice.getList();
		model.addAttribute("dlist",list);
		model.addAttribute("emp",emp);
		return "employee/edit-employee";
	}
	@RequestMapping("employee/update-record")
	public String updateEmployeeRecord(Employee emp,String date)
	{
		service.updateRecord(emp,date);
		return "redirect:dashboard";
	}
}
