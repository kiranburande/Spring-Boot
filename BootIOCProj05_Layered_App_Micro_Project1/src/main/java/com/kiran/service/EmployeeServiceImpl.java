package com.kiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.DAO.IEmployeeDAO;
import com.kiran.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<Employee> FetchAllEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> list = dao.getEmployeesByDesg(desg1, desg2, desg3);
		
		list.sort((e1,e2)-> e1.getEid().compareTo(e2.getEid()));
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+emp.getSalary()*0.4);
			emp.setNetSalary(emp.getSalary()+emp.getSalary()*0.2);
		});
		return list;
	}
	@Override
	public String insertEmpService(Employee emp) throws Exception 
	{
		Integer k =0;
		k = dao.insertDAOEmployee(emp);
		return k==0?"Employee Not Registered":"Employee Registered Successfuly...";
	}

}
