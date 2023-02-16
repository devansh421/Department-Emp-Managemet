package com.Divyanshu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Department;
import com.Divyanshu.services.DepartmentService;

@Controller
public class DepartmentController 
{
	@Autowired private DepartmentService service;
	
	@RequestMapping("department/dashboard")
	public String getDepartmentDashboard(Model model)
	{
		List<Department> list=service.getList();
		model.addAttribute("dlist",list);
		return "department/department-list";
	}
	@RequestMapping("department/add")
	public String getAddDepartmentView()
	{
		return "department/save-department";
	}
	@RequestMapping("department/save-record")
	public String saveDepartmentRecord(Department dept)
	{
		service.saveRecord(dept);
		return "redirect:dashboard";
	}
	@RequestMapping("department/delete-record")
	public String deleteDepartmentRecord(int did)
	{
		service.deleteRecord(did);
		return "redirect:dashboard";
	}
	@RequestMapping("department/edit-record")
	public String getEditDepartmentView(Model model,int did)
	{
		Department dd=service.getRecord(did);
		model.addAttribute("dept",dd);
		return "department/edit-department";
	}
	@RequestMapping("department/update-record")
	public String updateDepartmentRecord(Department dept)
	{
		service.updateRecord(dept);
		return "redirect:dashboard";
	}
}
