/**
 * 
 */
package customer.assignment;

import customerInfo.assignment.CustomerInfo;

/**
 * @author Bryan Denman
 * @date: Sep 23, 2022
 * 
 */
public class Customer1 {
	public static void main(String[] args) {
		      CustomerInfo[] c=new CustomerInfo[3];
		      c[0]=new CustomerInfo(0, null, null, null);
		     c[1]=new CustomerInfo(0, null, null, null);
		    c[2]=new CustomerInfo(0, null, null, null);
		      for(CustomerInfo cus : c ) {
		    	  System.out.println(cus.Display());
		      }
	}
}
