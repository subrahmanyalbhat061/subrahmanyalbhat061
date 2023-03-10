package com.ds.layer4;

import java.util.Iterator;
import java.util.List;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAOImpl empstaff= new EmployeeDAOImpl();
	@Override
	public void addEmployeeService(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public List getEmployeeService() {
		 return  empstaff.getEmployees();
		 
	}

	@Override
	public Employee getEmployeeService(int empno) {
		return empstaff.getEmployee(empno);
	}

	@Override
	public void updateEmployeeService(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployeeService(int empno) {
		// TODO Auto-generated method stub

	}

}
