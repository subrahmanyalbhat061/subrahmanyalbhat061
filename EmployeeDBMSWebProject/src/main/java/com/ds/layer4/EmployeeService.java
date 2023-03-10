package com.ds.layer4;

import java.util.List;

import com.ds.layer2.Employee;

public interface EmployeeService {
	public void addEmployeeService(Employee e);
	public List getEmployeeService();
	public Employee getEmployeeService(int empno);
	public void updateEmployeeService(Employee e);
	public void deleteEmployeeService(int empno);
	
}
