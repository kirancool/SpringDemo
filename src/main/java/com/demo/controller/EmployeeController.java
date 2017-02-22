package com.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Employee;

import com.demo.service.EmployeeService;

@RestController


public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;

 @RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
 public List<String> employees() throws SQLException {
  List<String> employees = employeeService.getEmployees();
  return employees;
 }

 @RequestMapping(value = "/employee/{username}", method = RequestMethod.GET)
 public Employee getEmployee(@PathVariable("username") String username) throws SQLException {
  Employee employee = employeeService.getEmployee(username);
 
  return employee;
 }

}