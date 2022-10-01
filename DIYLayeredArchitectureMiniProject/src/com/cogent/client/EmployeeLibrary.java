/**
 * 
 */
package com.cogent.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImp1;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImp1;

/**
 * @author Bryan Denman
 * @date: Sep 29, 2022
 * 
 */
public class EmployeeLibrary {
	
	public static void main(String[] args) {
		EmployeeRepoImp1 employeeRepoImp1=new EmployeeRepoImp1();
		EmployeeService employeeService=new EmployeeServiceImp1();
		String loop = "x";
		
		while (loop == "x") {
		System.out.println("***********  \n"
						   +"Main Menu    \n"
						   +"***********  \n"
						   + "1. Add new Employee\r\n"
						   + "2. View All Employee\r\n"
						   + "3. Find employee by Id\r\n"
						   + "4. Delete Employee by Id\r\n"
						   + "5. Find the youngest Employee\r\n"
						   + "6. Display All employee from country India\r\n"
						   + "7. Display All employee from country India and city Bangalore\r\n"
						   + "8. 8 to Exit");
		Scanner scanner=new Scanner(System.in);
		
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			while (true) {
				System.out.println("Please enter employee id: ");
				long employeeId = scanner.nextLong();
				System.out.println("Please enter employee's first name: ");
				String employeeFname = scanner.next();
				System.out.println("Please enter employee's last name: ");
				String employeeLname = scanner.next();
				System.out.println("Please enter employee's email: ");
				String employeeEmail = scanner.next();
				System.out.println("Please enter employee's age: ");
				int employeeAge = scanner.nextInt();
				System.out.println("Please enter whether the employee is married: True or false?");
				boolean employeeIsMarried = scanner.nextBoolean();
				
				System.out.println("Please enter employee's City name: ");
				String employeeCity = scanner.next();
				System.out.println("Please enter employee's Country name: ");
				String employeeCountry = scanner.next();
				EmployeeBean employeeBean = new EmployeeBean(employeeId,employeeFname,employeeLname,employeeEmail,
						employeeAge,employeeIsMarried,employeeCity,employeeCountry);
				employeeRepoImp1.addEmployee(employeeBean);
				System.out.println("Do you want to add more customers? Press Y or N: ");
				String decision = scanner.next();
				if (decision.equals("N")) {
					break;
					}
				}
				break;
		case 2:
			System.out.println("View all Employees:");
			for (EmployeeBean emp2 : employeeRepoImp1.viewAllEmployees()) {
				System.out.println(emp2.getEmployeeId() +" " + emp2.getEmployeeFname()+ " "+ emp2.getEmployeeLname());
			}
			System.out.println("");
			System.out.println("Press N to exit and Y to go back to main menu: ");
			String input2 =scanner.next();
			if (input2.equals("N")) {
				loop ="z";
			}
			break;
		case 3:
			while (true) {
			System.out.println("Search employee by id.");
			System.out.println("Enter employee id:");
			long input3 = scanner.nextLong();
			EmployeeBean selEmp = employeeRepoImp1.findEmployeeById(input3);
			System.out.println(selEmp.getEmployeeFname());	
			System.out.println("Press Y to search more and Press N to go to main menu");
			String input4 =scanner.next();
			if (input4.equals("N")) {	
				break;
				}
			}
			break;
		case 4:
		System.out.println("Delete employee by Id");
		long input5 = scanner.nextLong();
		EmployeeBean selEmp = employeeRepoImp1.findEmployeeById(input5);
		System.out.println(selEmp.getEmployeeFname());
		employeeService.deleteEmployee(selEmp);
		
		break;
		case 5:
			System.out.println("Find the youngest employee by Age");
			EmployeeBean selEmp1 = employeeRepoImp1.findYoungestEmployee();
			System.out.println(selEmp1.getEmployeeFname()+ " " + selEmp1.getEmployeeAge());	
			break;
		case 6:
			System.out.println("Display All employee from country India");
			String country = "India";
			
			List <EmployeeBean> selEmp2List = employeeRepoImp1.displayEmployeeByCountry(country);
			for (EmployeeBean x : selEmp2List) {
				System.out.println(x.getEmployeeId() +" " + x.getEmployeeFname());
			}
			break;
		case 7:
			System.out.println("Display All employee from country India and city Bangalore");
			String country1 = "India";
			String city = "Bangalore";
			List <EmployeeBean> selEmp2List2 = employeeRepoImp1.displayEmployeeByCountryandCity(country1, city);
			for (EmployeeBean x2 : selEmp2List2) {
				System.out.println(x2.getEmployeeId() +" " + x2.getEmployeeFname());
			}
			break;
		case 8:
			System.out.println("Exit progam");
			loop = "z";
			break;
		}
	}
  }
}
