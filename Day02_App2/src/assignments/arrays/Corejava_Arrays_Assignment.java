package assignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bryan Denman
 * @date: Sep 22, 2022
 * 
 */
public class Corejava_Arrays_Assignment {
	public static void main(String[] args) {
		
	}
	
}
class DS3_1{
	public static void main(String[] args) {
		System.out.println("Search a number in an arry: ");
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10};
		int Input, i;
		Integer index = null;
		boolean found = false;
		int counter = 0;
		
		Scanner In = new Scanner(System.in);
		System.out.println("Enter a number: ");
		Input = In.nextInt();
		
		for (i=0;i<arr.length;i++) {
			if(arr[i]== Input) {
				found = true;
				index = i;
				counter++;
			}
		}
		if (found ==true) {
			System.out.println("Found number: " + Input + " at index " + index + " and number is found " + counter + " times in array");
		} else { 
			System.out.println("Number not found.");
		}
	}
}
class DS3_2{
		   static int arr[] = {10, 324, 45, 90, 9808};
		     
		    // Method to find maximum in arr[]
		    static int largest()
		    {
		        int i;
		         
		        // Initialize maximum element
		        int max = arr[0];
		         
		        // Traverse array elements from second and
		        // compare every element with current max
		        for (i = 1; i < arr.length; i++)
		            if (arr[i] > max)
		                max = arr[i];
		         
		        return max;
		    }
		     
		    // Driver method
		    public static void main(String[] args)
		    {
		    	System.out.println("Find the largest number in an Array");
		        System.out.println("Largest in given array is " + largest());
		        }
		}
class DS3_3{
	public static void main(String[] args) {
		System.out.println("Sort an Array");
		//defining an array of integer type   
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
	}  
}
class DS3_4{
	public static void main(String[] args) {
		System.out.println("Sort the elements of an array in Decending order");
	    //Initialize array   
        int [] arr = new int [] {5, 2, 8, 7, 1};   
        int temp = 0;  
          
        //Displaying elements of original array  
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
          
        //Sort the array in descending order  
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] < arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        }  
          
        System.out.println();  
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in descending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
    }  
}
class DS3_5{
	public static void main(String[] args) {
		System.out.println("Sort elements of an Array in Acending Order");
	     //Initialize array   
        int [] arr = new int [] {5, 2, 8, 7, 1};   
        int temp = 0;  
          
        //Displaying elements of original array  
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
          
        //Sort the array in ascending order  
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] > arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        }  
        
        System.out.println();  
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
    }  
}
class DS3_6{
		
		public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
	       
	    public static void main (String[] args) {  
			System.out.println("Remove Duplicate Elements from an array");
	        int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    }  
	}  
class DS3_7{
	public static void main(String[] args) {
		System.out.println("Merge two Arrays");
		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
		int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
		int fal = firstArray.length;        //determines length of firstArray  
		int sal = secondArray.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);  
		System.out.println(Arrays.toString(result));    //prints the resultant array  
	}  
}
class DS3_8{
	public static void main(String[] args) {
		System.out.println("Check if two arrays are not equal");
	    // Initializing the first array
        int a[] = { 30, 25, 40 };
  
        // Initializing the second array
        int b[] = { 30, 25, 40 };
  
        // store the result
        // Arrays.equals(a, b) function is used to check
        // whether two arrays are equal or not
        boolean result = Arrays.equals(a, b);
  
        // condition to check whether the
        // result is true or false
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}
class DS3_9{
		// function to remove all occurrences
	    // of an element from an array
	    public static int[] removeElements(int[] arr, int key)
	    {
	        // Move all other elements to beginning
	        int index = 0;
	        for (int i=0; i<arr.length; i++)
	            if (arr[i] != key)
	                arr[index++] = arr[i];
	 
	        // Create a copy of arr[]
	        return Arrays.copyOf(arr, index);
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
			System.out.println("Remove all occurences of an element in an array");
	        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
	        int key = 3;
	        array = removeElements(array, key);
	        System.out.println(Arrays.toString(array));
	  }
}
class DS3_10{
	public static void main(String[] args) {
		System.out.println("Find common array elements");
	     int[] arr1 = {4,7,3,9,2};
	      int[] arr2 = {3,2,12,9,40,32,4};
	      
	      for(int i = 0;i < arr1.length; i++) {
	         for(int j = 0; j < arr2.length; j++) {
	            if(arr1[i] == arr2[j]) { 
	               System.out.println(arr1[i]);
	            } 
	         } 
	      }
   }
}
class DS3_11{
	public static void main(String[] args) {
		System.out.println("Copy all the elements of one array to another array ");
		 //Initializing an array
	    int [] firstArray = new int [] {3, 5, 7, 9, 11};
	    /* Creating another array secondArray with same size
	     * of first array using firstArray.length as it returns
	     * the size of array firstArray.
	     */
	    int secondArray[] = new int[firstArray.length];

	    //Displaying elements of first array
	    System.out.println("Elements of First array: ");
	    for (int i = 0; i < firstArray.length; i++) {
	      System.out.print(firstArray[i] + " ");
	    }

	    //Copying all elements of firstArray to secondArray
	    for (int i = 0; i < firstArray.length; i++) {
	      secondArray[i] = firstArray[i];
	    }

	    //Displaying elements of secondArray
	    System.out.println();
	    System.out.println("Elements of Copied array: ");
	    for (int i = 0; i < secondArray.length; i++) {
	      System.out.print(secondArray[i] + " ");
	    }
	  }
}
class DS3_12{
		  /*Function to left rotate arr[] of size n by d*/
	    void leftRotate(int arr[], int d, int n) 
	    {
	        int i;
	        for (i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	  
	    void leftRotatebyOne(int arr[], int n) 
	    {
	        int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[i] = temp;
	    }
	  
	    /* utility function to print an array */
	    void printArray(int arr[], int size) 
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	    }
	  
	    // Driver program to test above functions
	    public static void main(String[] args) 
	    {
	    	System.out.println("For Array Rotation");
	        DS3_12 rotate = new DS3_12();
	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        rotate.leftRotate(arr, 2, 7);
	        rotate.printArray(arr, 7);
	   }
}
