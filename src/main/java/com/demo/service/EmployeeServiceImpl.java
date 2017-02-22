package com.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.bean.Employee;
import com.demo.dao.EmployeeDao;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
 @Autowired
 private EmployeeDao employeeDao;

 public List<String> getEmployees() throws SQLException {
  List<String> employees = employeeDao.getEmployees();
  return employees;
 }

 public Employee getEmployee(String username) throws SQLException {
  Employee employee = employeeDao.getEmployee(username);
  return employee;
 }


}