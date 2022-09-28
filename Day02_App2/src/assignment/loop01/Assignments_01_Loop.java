package assignment.loop01;
import java.util.Scanner;

/**
 * @author Bryan Denman
 * @date: Sep 21, 2022
 * 
 */
public class Assignments_01_Loop {

	public static void main(String[] args) {
		System.out.println("Assignments_01_Loop Q&A's");

	}

}
class DS2_1 {
	public static void main(String[] args) {
		System.out.println("Check if a number is Prime or not");
		  int n;
	      Scanner my_scanner = new Scanner(System.in);
	      System.out.print("Enter the number : ");
	      n = my_scanner.nextInt();
	      boolean isprime = false;
	      for (int i = 2; i <= n / 2; ++i) {
	         if (n % i == 0) {
	            isprime = true;
	            break;
	         }
	      }
	      if (!isprime)
	         System.out.println("The number " +n + " is a prime number.");
	      else
	         System.out.println("The number " +n + " is not a prime number.");
	   }
	}
class DS2_2 {
	public static void main(String[] args) {
		System.out.println("Print list of all prime numbers within a given range, print numbers from 1 to 10");
		int a,b,i,j;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Give a starting range to print prime numbers: ");
		a = s.nextInt();
		System.out.println("Give a ending range to print prime numbers: ");
		b = s.nextInt();
		
		for (i=a;i<=b;i++) {
			for (j=2;j<=i;j++) {
		if (i % j == 0) {
            break;
	}
  }
if (i==j) {
	System.out.println(j);
}
	}
		System.out.println("Print numbers 1 to 10");
		int n;
		for(n=1;n<=10;n++) {
			System.out.println(n);
		}
	}
}
class DS2_3 {
	public static void main(String[] args) {
		System.out.println("Calculate the sum of first 10 natural numbers");
		int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("Sum of first 10 natural number is: " + sum);
	}
}
class DS2_4 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=0;
	    System.out.println("Enter the number: ");
	    num=sc.nextInt();
	    for(int i=1; i<=10; i++){
	    System.out.println(num+"x"+i+"="+num*i);
	                }
	            }
	        }
class DS2_5 {
	public static void main(String[] args) {
		//Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   
}
class DS2_6 {
	public static void main(String[] args) {
		System.out.println("Enter two numbers throught the keybopard, and find the value of one number raised to another");
	
	}
}
class DS2_7 {
	public static void main(String[] args) {
		System.out.println("Input integer and output integer in reverse");
		        //Scanner class object craeted
		        Scanner sc=new Scanner(System.in);
		        //taking user input of a Number
		         System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        //intger variable 'rev' to store reverse value
		        int rev = 0;
		        
		        //find reverse using while loop
		        while (num != 0) 
		        {
		            rev = rev * 10 + num % 10;
		            num = num / 10;
		        }
		        System.out.println("Reversed number: " + rev);
		    }
		}
class DS2_8{
	public static void main(String[] args) {
	     Scanner console = new Scanner(System.in);
	     
	        int number;
	        char choice;
	        int even = 0;
	        int odd = 0;
	 
	        do
	        {
	            System.out.print("Enter any number ");
	            number = console.nextInt();
	 
	            if( number % 2 == 0)
	            {
	                even += number;
	            }
	            else
	            {
	                odd += number;
	            }
	 
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	 
	        }while(choice=='y' || choice == 'Y');
	 
	        System.out.println("Sum of even numbers: " + even);
	        System.out.println("Sum of odd numbers: " + odd);
	    }  
	}
class DS2_9 {
	public static void main(String[] args) {
		System.out.println("Input a postive integer than out put whether it is prime or not");
		 int num = 28;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
class DS2_10 {
	public static void main(String[] args) {
		System.out.println("Input a postive integer than out put whether it is prime or not");
		 int num = 28;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
class DS2_11 {
	public static void main(String[] args) {
		System.out.println("Calculate the highest common factor of two numbers");
		 int a, b, i, hcf = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number :: ");
	      a = sc.nextInt();
	      System.out.println("Enter second number :: ");
	      b = sc.nextInt();

	      for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
	      System.out.println("HCF of given two numbers is ::"+hcf);
	   }
	}
class DS2_12 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int sum = 0;
	    char op;
	    do{
	      System.out.println("Enter two numbers");
	      int num1= in.nextInt();
	      int num2 = in.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");
	      op =in.next().charAt(0);
	    }while(op =='Y'||op=='y');
	    System.out.println("sum "+sum);
	  }
	}
class DS2_13 {
	public static void main(String[] args) {
		System.out.println("Enter numbers and display positive, negative and zero");
	    int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
         
    }
}
class DS2_14 {
	public static void main(String[] args) {
		System.out.println("Enter numbers and out put smallest and largest numbers entered.");
	    Scanner console = new Scanner(System.in);
	    
        int number;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
 
        char choice;
 
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}
class DS2_15 {
	public static void main(String[] args) {
	       int n, count = 0, a, b, c, sum = 0;
	        System.out.print("Armstrong numbers from 1 to 500:");
	        for(int i = 1; i <= 500; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }
	    }
	}
class DS2_16 {
	public static void main(String[] args) {
		//Take input from the user
        //Create instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
class DS2_17 {
	 static double findSum(int n) {
	        double sum = 0;

	        for (double i = 1; i <= n; i++) {
	            sum = sum + 1 / i;
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of n: ");
	        int n = sc.nextInt();

	        System.out.printf("Sum upto " + n + "th value in the series is: %.2f",findSum(n));
	    }
	}
class DS2_18 {
	public static void main(String[] args) {
		
	}
}
class DS2_19 {
	public static void main(String[] args) {
		System.out.println("n is a positive input by user");
	}
}
class DS2_20 {

    // Function that implements the
    // number guessing game
    public static void
    guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100
                               * Math.random());
 
        // Given K trials
        int K = 5;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");
 
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
    // Driver Code
    public static void
    main(String arg[])
    {
 
        // Function Call
        guessingNumberGame();
    }
}