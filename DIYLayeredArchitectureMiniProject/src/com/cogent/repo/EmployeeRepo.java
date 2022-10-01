/**
 * 
 */
package com.cogent.repo;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Bryan Denman
 * @date: Sep 29, 2022
 * 
 */
public interface EmployeeRepo {
	public void addEmployee(EmployeeBean employeeBean);
	public List <EmployeeBean> viewAllEmployees();
	public EmployeeBean findEmployeeById(long employeeId);
	public void deleteEmployee(EmployeeBean employeeBean);
	public EmployeeBean findYoungestEmployee();
	public List <EmployeeBean> displayEmployeeByCountry(String employeeCountry);
	public List <EmployeeBean> displayEmployeeByCountryandCity(String employeeCountry, String employeeCity);
}
