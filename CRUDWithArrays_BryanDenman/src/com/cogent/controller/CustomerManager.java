package com.cogent.controller;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;

/**
 * @author Bryan Denman
 * @date: Sep 26, 2022
 * 
 */
public class CustomerManager {

	public static void main(String[] args) {
		
		CustomerRepo customerRepo = new CustomerRepo();
		String loop = "x";
		
		while (loop == "x") {
			System.out.println("************************************ \n" +
							   " CUSTOMER MANAGEMENT SYSTEM \n" +
							   "************************************ \n" +
							   
					"1. Add Customer	\n" +
					"2. View All Customer \n" +
					"3. Search Customer by Id \n" +
					"4. Exit \n");
			
			Scanner sc=new Scanner(System.in);
			
			int input = sc.nextInt();
			switch (input) {
			case 1:
				while (true) {
				System.out.println("Please enter customer id: ");
				long idNum = sc.nextLong();
				System.out.println("Please enter customer name: ");
				String cusName = sc.next();
				
				CustomerBean cus = new CustomerBean(idNum,cusName);
				customerRepo.addCustomer(cus);
				System.out.println("Do you want to add more customers? Press Y or N: ");
				String decision = sc.next();
				if (decision.equals("N")) {
					break;
					}
				}
				break;
			case 2:
				System.out.println("View all customers:");
				for (CustomerBean cus2 : customerRepo.viewAllCustomer()) {
					System.out.println(cus2.getCustomerId() +" " + cus2.getCustomerName());
				}
				System.out.println("");
				System.out.println("Press N to exit and Y to go back to main menu: ");
				String input2 =sc.next();
				if (input2.equals("N")) {
					loop ="z";
				}
				break;
			case 3:
				while (true) {
				System.out.println("Search customer by id.");
				System.out.println("Enter customer id:");
				long input3 = sc.nextLong();
				CustomerBean selCus = customerRepo.searchCustomerById(input3);
				System.out.println(selCus.getCustomerName());	
				System.out.println("Press Y to search more and Press N to go to main menu");
				String input4 =sc.next();
				if (input4.equals("N")) {	
					break;
					}
				}
				break;
			case 4:
				System.out.println("Exit progam");
				loop = "z";
				break;
		}
	 }
	}
}
