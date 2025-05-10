package com.kiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kiran.model.Employee;
import com.kiran.service.IEmployeeService;

@Controller("empController")
public class EmployeeController 
{
	@Autowired
	private IEmployeeService empService;
	
	public List<Employee> showEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> list = null;
		list = empService.FetchAllEmployeesByDesg(desg1, desg2, desg3);
		
		return list;
	}
	
	public String processEmployee(Employee emp)throws Exception
	{
		String resultMsg = empService.insertEmpService(emp);
		return resultMsg;
	}
	
}
