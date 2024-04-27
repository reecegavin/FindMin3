/**
 * Program to find the minimum of three integer numbers
 * 
 * @author Reece
 * @version 20 Sep 17
 */


import java.util.Scanner;           // Program will use the Scanner class in package java.util

public class Findmin3
{// begin class

    public static void main(String[] args)
    {// begin main method
        
        System.out.print("Program to compare two numbers ");
        System.out.println("and output the smallest");

        Scanner input = new Scanner(System.in); // Scanner used for input from keyboard device System.in

        System.out.print("Enter 1st number: ");
        int number1;
        number1 = input.nextInt();      // Request Scanner object to get next integer and store in number1

        System.out.print("Enter 2nd number: ");
        int number2 = input.nextInt();  // Request Scanner object to get next integer and store in number2
        
        System.out.print("Enter 3nd number: ");
        int number3 = input.nextInt();  // Request Scanner object to get next integer and store in number3
        
        int smallest;
        if (number1 < number2)
            smallest = number1;           // Executed if condition is true
        else
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
      
    
        // Executed if condition is true

        System.out.print("The smallest number entered is ");
        System.out.println( smallest );
        System.out.println();           // Blank line

       //Min method
        System.out.println( "Calling method Min - The smallest of these three integers (42, 580, 220) is " + min(42, 580, 220) );
        System.out.println();
        System.out.println( "Using method Min, the smallest of the integers you entered is:  " + min(number1, number2, number3) ); 
        System.out.println();
        System.out.printf( "The smallest of(%d,%d,%d) is %d\n", 57, 5, 669, min(57,5,669));
        System.out.println();
        System.out.printf( "The smallest of(%d,%d,%d) is %d\n", number1, number2, number3, min(number1,number2,number3) );
    }// end main

    /**
     * Method max determines and returns the largest of the two parameters a and b
     */
    public static int min(int a, int b, int c)
    {
        int smallest;
        if (a < b)
            smallest = a;
        else
            smallest = b;
        if (c < smallest)
            smallest = c;
            return smallest;
    }
}// end class
