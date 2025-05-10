package com.kiran;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kiran.controller.EmployeeController;
import com.kiran.model.Employee;

@SpringBootApplication
public class BootIocProj05LayeredAppMicroProject1Application 
{
   // private final EmployeeController empController;
//
//    BootIocProj05LayeredAppMicroProject1Application(EmployeeController empController) {
//        this.empController = empController;
//    }

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj05LayeredAppMicroProject1Application.class, args);
		
		EmployeeController empController = ctx.getBean("empController",EmployeeController.class);
		
		try(Scanner sc = new Scanner(System.in);)
		{
			while(true)
			{
				System.out.println("*****Operations******");
				System.out.println("1. Insert Employee");
				System.out.println("2. View All Employees");
				System.out.println("3. Exit");
				System.out.println("Enter Your Choice : ");
				Integer i = sc.nextInt();
				switch(i)
				{
				case 1:
					System.out.println("Enter Employee Name :");sc.nextLine();
					String eName = sc.nextLine();
					System.out.println("Enter Employee Designation :");
					String eDesg = sc.nextLine();
					System.out.println("Enter Employee Salary :");
					Double eSalary = sc.nextDouble();
					System.out.println("Enter Employee Department Number :");
					Integer eDeptNo = sc.nextInt();
					Employee emp = new Employee();
					emp.setEname(eName); emp.setDesg(eDesg); emp.setSalary(eSalary); emp.setDeptno(eDeptNo);
					String resultMsg = empController.processEmployee(emp);
					System.out.println(resultMsg);
					break;
					
				case 2:System.out.println("Enter Designation 1 :");
				sc.nextLine();
				String desg1 = sc.nextLine();
				System.out.println("Enter Designation 2 :");
				String desg2 = sc.nextLine();
				System.out.println("Enter Designation 3 :");
				String desg3 = sc.nextLine();
				List<Employee> list = empController.showEmployeeByDesg(desg1.trim(), desg2.trim(), desg3.trim());
				list.forEach(System.out::println);
				    break;
				    
				case 3:System.out.println("Exit Successfully...");
					System.exit(0);
					break;
					
				default:System.out.println("Invalid Choice...");
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
