package com.kiran.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiran.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO
{
	private static final String GET_EMPS_QUERY = "SELECT EID, ENAME, DESG, SALARY, DEPTNO FROM EMP07 WHERE DESG IN(?,?,?) ORDER BY DESG";
	private static final String INSERT_EMP_QUERY = "INSERT INTO EMP07 VALUES(empno_seq1.NEXTVAL,?,?,?,?)";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> list = new ArrayList<Employee>();
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);)
		{
			// get employees by designations
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			// execute the sql query
			try(ResultSet rs = ps.executeQuery();)
			{
				//copy each record of the ResultSet object to Model class obj
				while(rs.next())
				{
					Employee emp = new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}//try2
		}//try1
		catch(SQLException se)
		{
			//se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			throw e;
		}
		
		return list;
	}

	@Override
	public int insertDAOEmployee(Employee emp) throws Exception {
		Integer k  =0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_EMP_QUERY);)
		{
			//ps.setInt(1, emp.getEid());
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());
			k = ps.executeUpdate();
		}
		catch(SQLException se)
		{
			//se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			throw e;
		}
		return k;
		
		
	}

}
