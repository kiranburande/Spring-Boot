package com.kiran.service;

import java.util.List;

import com.kiran.model.Employee;

public interface IEmployeeService 
{
	public List<Employee> FetchAllEmployeesByDesg(String desg1,String desg2,String desg3)throws Exception;
	public String insertEmpService(Employee emp)throws Exception;
}
