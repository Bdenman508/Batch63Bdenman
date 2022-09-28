/**
 * @author Bryan Denman
 * @date: Sep 21, 2022
 * 
 */
public class Accept_The_Number {

	public static void main(String[] args) {
		System.out.println("Accept the Number find the reverse number");
		int number = 123;
		int reverse = 0;  
		System.out.println("Number Accepted: " +number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
