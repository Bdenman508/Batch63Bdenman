/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImp1;

/**
 * @author Bryan Denman
 * @date: Sep 29, 2022
 * 
 */
public class EmployeeServiceImp1 implements EmployeeService {
	EmployeeRepo employeeRepo=new EmployeeRepoImp1();
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employeeRepo.addEmployee(employeeBean);

	}

	@Override
	public List<EmployeeBean> viewAllEmployees() {
		return employeeRepo.viewAllEmployees();
	}

	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
	
		return employeeRepo.findEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployee(EmployeeBean employeeBean) {
		employeeRepo.deleteEmployee(employeeBean);
	}

	@Override
	public EmployeeBean findYoungestEmployee() {
		
		return employeeRepo.findYoungestEmployee();
	}

	@Override
	public List<EmployeeBean> displayEmployeeByCountry(String employeeCountry) {
		
		return employeeRepo.displayEmployeeByCountry(employeeCountry);
	}

	@Override
	public List<EmployeeBean> displayEmployeeByCountryandCity(String employeeCountry, String employeeCity) {
		
		return employeeRepo.displayEmployeeByCountryandCity(employeeCountry,employeeCity);
	}

}
