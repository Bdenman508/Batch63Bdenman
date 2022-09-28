/**
 * 
 */
package customerInfo.assignment;

/**
 * @author Bryan Denman
 * @date: Sep 23, 2022
 * 
 */
public class CustomerInfo {
		private int custID;
		private String custName;
		private String location;
		private String contactNo;
		
		public CustomerInfo(int custID, String custName, String location, String contactNo) {
			super();
			this.custID = custID;
			this.custName = custName;
			this.location = location;
			this.contactNo = contactNo;
		}
		public String Display() {
			return "CustomerInfo [custID=" + custID + ", custName=" + custName + ", location=" + location
					+ ", contactNo=" + contactNo + "]";
		}
		
}
