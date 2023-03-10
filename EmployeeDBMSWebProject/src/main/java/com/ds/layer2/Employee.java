package com.ds.layer2;

public class Employee {
		// TODO Auto-generated method stub
             private int employeeNumber;
             private String employeeName;
             private String employeeJob;
             private int employeeSalary;
			public Employee(int employeeNumber, String employeeName, String employeeJob, int employeeSalary) {
				super();
				this.employeeNumber = employeeNumber;
				this.employeeName = employeeName;
				this.employeeJob = employeeJob;
				this.employeeSalary = employeeSalary;
			}
			public Employee() {
				super();
				// TODO Auto-generated constructor stub
			}
			public int getEmployeeNumber() {
				return employeeNumber;
			}
			public void setEmployeeNumber(int employeeNumber) {
				this.employeeNumber = employeeNumber;
			}
			public String getEmployeeName() {
				return employeeName;
			}
			public void setEmployeeName(String employeeName) {
				this.employeeName = employeeName;
			}
			public String getEmployeeJob() {
				return employeeJob;
			}
			public void setEmployeeJob(String employeeJob) {
				this.employeeJob = employeeJob;
			}
			public int getEmployeeSalary() {
				return employeeSalary;
			}
			public void setEmployeeSalary(int employeeSalary) {
				this.employeeSalary = employeeSalary;
			}
			@Override
			public String toString() {
				return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName
						+ ", employeeJob=" + employeeJob + ", employeeSalary=" + employeeSalary + "]";
			}
			
}
