package com.ds.layer3;


import java.util.List;

import com.ds.layer2.Employee;
//POJI
public interface EmployeeDAO {
void   addEmployee(Employee e);
List<Employee> getEmployees();
Employee getEmployee(int empno);
void updateEmployee(Employee e);
void deleteEmployee(int empno);


}
