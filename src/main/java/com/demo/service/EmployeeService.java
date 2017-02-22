package com.demo.service;

import java.sql.SQLException;
import java.util.List;


import com.demo.bean.Employee;

public interface EmployeeService {
	 public List<String> getEmployees() throws SQLException;
	 public Employee getEmployee(String username) throws SQLException;


}
