/**
 * 
 */
package com.cogent.repo;
import java.util.ArrayList;
import java.util.List;
import com.cogent.bean.CustomerBean;

/**
 * @author Bryan Denman
 * @date: Sep 26, 2022
 * 
 */
public class CustomerRepo {
	List<CustomerBean> customerList;
	
	public CustomerRepo() {
		customerList=new <CustomerBean> ArrayList();
		
	}
	public void addCustomer(CustomerBean customerBean) {
		customerList.add(customerBean);
		
	}
	public List<CustomerBean> viewAllCustomer() {
		return customerList;
		
	}
	public CustomerBean searchCustomerById(Long id) {
		CustomerBean selCus=null;
		
		for (CustomerBean cus : customerList) {
			if (cus.getCustomerId() == id) {
				selCus = cus;
			}
		}
		return selCus;
	}
}
