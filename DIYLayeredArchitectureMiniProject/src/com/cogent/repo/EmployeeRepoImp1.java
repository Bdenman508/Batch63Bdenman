/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Bryan Denman
 * @date: Sep 29, 2022
 * 
 */
public class EmployeeRepoImp1 implements EmployeeRepo {
	List <EmployeeBean> employeeList;
	
	public EmployeeRepoImp1() {
		employeeList=new <EmployeeBean> ArrayList();
		
		employeeList.add(new EmployeeBean(1,"bryan","denman","bdenman@gmail.com",31,false,"boston","Massachusetts"));
		employeeList.add(new EmployeeBean(2,"Sharon","denman","sdenman@gmail.com",32,true,"boston","Massachusetts"));
		employeeList.add(new EmployeeBean(3,"bryan","denman","bdenman@gmail.com",34,false,"boston","Massachusetts"));
		employeeList.add(new EmployeeBean(4,"bryan","denman","bdenman@gmail.com",35,false,"boston","Massachusetts"));
	}
	public List<EmployeeBean> getEmployee() {
		return employeeList;
	}
	public void setEmployee(List<EmployeeBean> employeeList) {
		this.employeeList = employeeList;
	}
	
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employeeList.add(employeeBean);
	}

	@Override
	public List<EmployeeBean> viewAllEmployees() {
		
		
		return employeeList;
	}

	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		EmployeeBean selEmp=null;
		
		for (EmployeeBean employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				selEmp = employee;
			}
		}
		return selEmp;
	}

	@Override
	public void deleteEmployee(EmployeeBean employeeBean) {
		employeeList.remove(employeeBean);
	}

	@Override
	public EmployeeBean findYoungestEmployee() {
		EmployeeBean youngestEmployee=null;
		int maxAge = 999;
		int minAge = 0;
		for(EmployeeBean emp1 : employeeList) {
			if(emp1.getEmployeeAge() < maxAge ) {
				youngestEmployee=emp1;
				maxAge= emp1.getEmployeeAge();
			}
	     }
		return youngestEmployee;
	}

	@Override
	public List<EmployeeBean> displayEmployeeByCountry(String employeeCountry) {
		List <EmployeeBean> empByCountryList=null;
		for(int i=0;i<employeeList.size();i++) {
			EmployeeBean employee=employeeList.get(i);
			if(employee.getEmployeeCountry()==employeeCountry) {
				empByCountryList.add(employee);
		   }
	  }
		return empByCountryList;
	}

	@Override
	public List<EmployeeBean> displayEmployeeByCountryandCity(String employeeCountry, String employeeCity) {
		List <EmployeeBean> empByCountryList2=null;
		for(int i=0;i<employeeList.size();i++) {
			EmployeeBean employee=employeeList.get(i);
			if(employee.getEmployeeCountry()==employeeCountry && employee.getEmployeeCity()==employeeCity) {
				empByCountryList2.add(employee);
		   }
	  }
		return empByCountryList2;
	}
}
