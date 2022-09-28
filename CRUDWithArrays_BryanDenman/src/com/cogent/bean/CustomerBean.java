/**
 * 
 */
package com.cogent.bean;

/**
 * @author Bryan Denman
 * @date: Sep 26, 2022
 * 
 */
public class CustomerBean {
	private long customerId;
	private String customerName;
	
	public CustomerBean(long customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
