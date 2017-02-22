package com.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {
	 public List<String> getEmployees() throws SQLException;
	 public Employee getEmployee(String username) throws SQLException;
	


}
