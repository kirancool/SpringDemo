package com.demo.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

 
 private String username;
 private String password;

 @JsonCreator
 public Employee( @JsonProperty("username") String username,
   @JsonProperty("password") String password) {

  this.username = username;
  this.password = password;
 
 }

 public Employee() {

 }


 
 
 @Override
 public String toString() {
  StringBuilder str = new StringBuilder();

  str.append(" username:- " + getUsername());
  str.append("password:- " + getPassword());

  return str.toString();
 }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}