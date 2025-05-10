package com.kiran.DAO;

import java.util.List;

import com.kiran.model.Employee;

public interface IEmployeeDAO 
{
	public List<Employee> getEmployeesByDesg(String desg1,String desg2 ,String desg3) throws Exception;
	
	public int insertDAOEmployee(Employee emp)throws Exception;
	
}
