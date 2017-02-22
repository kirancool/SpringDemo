package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.demo.bean.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	 private static String driverName = "org.apache.hive.jdbc.HiveDriver";
 /*public JdbcTemplate jdbcTemplate;
 public JdbcTemplate hiveTemplate;*/

/* @Autowired
 public void setDataSource(DataSource dataSource) {
  this.jdbcTemplate = new JdbcTemplate(dataSource);
 }*/
 /*public void setHiveTemplate(JdbcTemplate hiveTemplate) 
 { 
	 this.hiveTemplate = hiveTemplate;
	 }*/
 public List<String> getEmployees() throws SQLException {
	/*List<Employee> employees=new ArrayList<Employee>();*/
  try
  {
	  Class.forName(driverName);
  } catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  //replace "hive" here with the name of the user the queries should run as
  Connection con = DriverManager.getConnection("jdbc:hive2://10.10.0.30:10000/kiran", "hive", "");
  Statement stmt = con.createStatement();
 
  String sql= "select * from stockmarketdata limit 10";
  ResultSet res = stmt.executeQuery(sql);
/*  if (res.next()) {
    System.out.println(res.getString(1));
  }*/
  res = stmt.executeQuery(sql);
  ArrayList<String> empList = new ArrayList<>();
  while (res.next()) {
   // System.out.println(String.valueOf(res.getString(1)) + "\t" + res.getString(2));
   
    String emp=(String.valueOf(res.getString(1)) + "   " + res.getString(2)+"  "+res.getString(3)+" "+res.getString(4));
    empList.add(emp);
	
  }
 
return empList;

 
 }
  /*
  try {
   employees = hiveTemplate.queryForLong("SELECT * FROM login");   
  } catch (DataAccessException e) {
   e.printStackTrace();
  }
  return employees;*/


 public Employee getEmployee(String username) throws SQLException {
  Employee employee = null;
  try {

	  Class.forName(driverName);
  } catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  //replace "hive" here with the name of the user the queries should run as
  Connection con = DriverManager.getConnection("jdbc:hive2://10.10.0.30:10000/kiran","hive", "");
   /*employee = ((JdbcTemplate) con).queryForObject("SELECT * FROM login WHERE username = ?",
     new Object[] { username }, new BeanPropertyRowMapper<Employee>(Employee.class));*/
  
  return employee;

 }
}