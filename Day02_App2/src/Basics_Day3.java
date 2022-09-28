import java.util.Scanner;

/**
 * @author Bryan Denman
 * @date: Sep 21, 2022
 */
public class Basics_Day3 {
	public static void main(String[] args) {
		System.out.println("DS1.1 Bryan Denman\r\n"
				+ "DS1.2 Check if number is even or odd?\r\n"
				+ "DS1.3 Find the Bigger number among two\r\n"
				+ "DS1.4 Swap two number\r\n"
				+ "DS1.5 Swap two numbers without using extra variable \r\n"
				+ "DS1.6 Check number is even or odd using ternary operator\r\n"
				+ "DS1.7 Find Bigger number among three numbers\r\n"
				+ "DS1.8 Find a character is vowel or constant\r\n"
				+ "\r\n"
				+ "Create aPrject in your local system\r\n"
				+ "complete all your assignments\r\n"
				+ "and everyday push your project in git repository");
	}
}

class DS1_1 {
	public static void main(String[] args) {
		System.out.println("Bryan Denman");
	}
}
class DS1_2 {
	public static void main(String[] args) {
		System.out.println("DS1.1. ");
		int a=10,b=7,c=2;		
		if(a % 2 == 0) 
			System.out.println("a is Even");
		else
			System.out.println("a is Odd");
		if(b % 2 == 0) 
			System.out.println("b is Even");
		else
			System.out.println("b is Odd");
		if(c % 2 == 0) 
			System.out.println("c is Even");
		else
			System.out.println("c is Odd");
	}
}
class DS1_3 {
	public static void main(String[] args) {
		System.out.println("Find the bigger number between the two");
		int a=10,b=7;
		if(a > b)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");
	}
}
class DS1_4 {
	public static void main(String[] args) {
		System.out.println("Swap the two numbers");
		float first = 10, second = 7;
		
		  System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        first = first - second;
	        second = first + second;
	        first = second - first;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	}
}
class DS1_5 {
	public static void main(String[] args) {
		System.out.println("Swap two numbers without using extra variable");
        int x = 20, y=30;
        
        //Print both number before swapping
        System.out.println("x = "+x+", y= "+y);
         
        //Logic to swap these numbers without using a third variable
         
        x = x + y;      
        y = x - y;      
        x = x - y;
         
        //Printing the both number again after swapping
        System.out.println("x = "+x+", y= "+y);
	}
}
class DS1_6 {
	public static void main(String[] args) {
		System.out.println("Check is number is even or odd using ternary operator");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = scan.nextInt();
		
		scan.close();

		//ternary operator to check number
		String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);
	}
}
class DS1_7 {
	public static void main(String[] args) {
		System.out.println("Find Bigger number among three numbers");
		int a=40, b=78, c=19;  
		//comparing numbers, a with b and a with c   
		//if both conditions are true, prints a  
		if(a>=b && a>=c)  
		System.out.println(a+" is the largest Number");  
		//comparing b with a and b with c  
		//if both conditions are true, prints b  
		else if (b>=a && b>=c)  
		System.out.println(b+" is the largest Number");  
		else  
		//prints c if the above conditions are false  
		System.out.println(c+" is the largest number");  

	}
}
class DS1_8 {
	public static void main(String[] args) {
		System.out.println("Find a character is a vowel or a constant");
		  System.out.println("Enter a character :");
	      Scanner sc = new Scanner(System.in);
	      char ch = sc.next().charAt(0);
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	         System.out.println("Given character is an vowel");
	      }else{
	         System.out.println("Given character is a consonant");
	      }
	}
}		