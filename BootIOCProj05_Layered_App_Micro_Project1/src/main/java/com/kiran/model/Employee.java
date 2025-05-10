package com.kiran.model;

import lombok.Data;

@Data
public class Employee 
{
	private Integer eid;
	private String ename;
	private String desg;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
}
