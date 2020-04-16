/*
 * April 16, 2020
 * Erika Graham
 * My first subroutine program
 */
package myfirstsubroutine;

import java.util.Scanner;

public class MyFirstSubroutine {

    public static void avrgNum (int n1, int n2, int n3, int n4)
    {
        double sum = n1+n2+n3+n4; //perform the calculations
        double total = sum / 4;
        //print result to the user
        System.out.println("The average of these 4 numbers is: "+total);
    }
    
    public static void perimeterCalc (double n1, double n2, double n3, double n4)
    {
        double sum = n1+n2+n3+n4; //perform the calculations
        //rounding to 2 decimal places
        sum = sum * 100;
        sum = Math.round(sum);
        sum = sum / 100;
        //print result to the user
        System.out.println("The perimeter of this rectangle is: "+sum);
    }
    
    public static void rectArea (double n1, double n2)
    {
        double area = n1 * n2;  //perform calculations
        //rounding to 2 decimal places
        area = area * 100;
        area = Math.round(area);
        area = area / 100;
        //print result to user
        System.out.println("The area of this rectangle is: "+area);
    }
    
    public static void rectVol (double n1, double n2, double n3)
    {
        double volume = n1*n2*n3;   //perform operation
        //round result
        volume = volume * 100;
        volume = Math.round(volume);
        volume = volume / 100;
        //print result to user
        System.out.println("The volume of this rectangular prism is: " +volume);
    }
    
    public static void primeNum (int n1)
    {
        int prime = n1;     //declared variables
        int indicator = 3;
        //for loop to identify how many times the number can be divided by 2
        for (int i = 2; i <= prime / 2; ++i) {
            if (prime % i == 0) //condition for nonprime numbers
            {
                indicator = 4;
            }
        }
        // print result to user
        if (indicator == 3) {
            System.out.println(prime + " is a prime number");
        } else {
            System.out.println(prime + " is not a prime number");
        }
    }
    
    public static void main(String[] args) {
       
        Scanner userInput = new Scanner (System.in);
        
        //Menu
        System.out.println("Please enter your choice:\n"+
                "1... Find the average of 4 numbers\n"+
                "2... Find the perimeter of a rectangle\n"+
                "3... Find the area of a rectangle\n"+
                "4... Find the volume of a rectangular prism\n"+
                "5...Determine if a number is prime\n"+
                "6... Exit");
        int choice = userInput.nextInt();
        
        //while loop for the menu
        while(choice != 6)
        {
            if (choice == 1) //find averages between 4 numbers
            {
                int num1, num2, num3, num4; //declaring variables
                //reminder for the user
                System.out.println("You chose to find the average of 4 integers");
                //prompts to the user
                System.out.println("Enter first integer: ");
                num1 = userInput.nextInt();
                
                System.out.println("Enter second integer: ");
                num2 = userInput.nextInt();
                
                System.out.println("Enter third integer: ");
                num3 = userInput.nextInt();
                
                System.out.println("Enter fourth integer: ");
                num4 = userInput.nextInt();
                //calling the procedure
                avrgNum (num1, num2, num3, num4);
            }
            //find perimeter of rectangle
            if (choice == 2) 
            {
                double num1, num2, num3, num4;  //variables
                //reminder for the user
                System.out.println("You chose to find the perimeter of a rectangle");
                //prompts to the user
                System.out.println("Enter first side: ");
                num1 = userInput.nextDouble();
                
                System.out.println("Enter second side: ");
                num2 = userInput.nextDouble();
                
                System.out.println("Enter third side: ");
                num3 = userInput.nextDouble();
                
                System.out.println("Enter fourth side: ");
                num4 = userInput.nextDouble();
                //calling the procedure
                perimeterCalc (num1, num2, num3, num4);
            }
            //find the area of a rectangle
            if (choice == 3)
            {
                double length, width;   //variables declared
                //reminder for the user
                System.out.println("You've chosen to find the area of a rectangle");
                //prompts to the user
                System.out.println("Enter the length: ");
                length = userInput.nextDouble();
                
                System.out.println("Enter the width: ");
                width = userInput.nextDouble();
                //calling the procedure
                rectArea(length, width);
            }
            //find the volume of a rectangular prism
            if (choice == 4)
            {
                double length, height, width;   //variables declared
                // reminder to the user
                System.out.println("You've chosen to find the volume of a rectangular prism");
                //prompts to the user
                System.out.println("Enter the length: ");
                length = userInput.nextDouble();
                
                System.out.println("Enter the height: ");
                height = userInput.nextDouble();
                
                System.out.println("Enter the width: ");
                width = userInput.nextDouble();
                //call the procedure
                rectVol(length, height, width);
            } 
            //determine if a number is prime
            if (choice == 5)
            {
                int prime;  //declared variables
                //reminder to the user
                System.out.println("You've chosen to determine if an integer is prime");
                //prompt to the user
                System.out.println("Enter your integer: ");
                prime = userInput.nextInt();
                //call the procedure
                primeNum (prime);
            }
                //while loop menu when choice is not 6
            System.out.println("--------------------------------------");
                System.out.println("Please enter your choice:\n"+
                "1... Find the average of a number\n"+
                "2... Find the perimeter of a rectangle\n"+
                "3... Find the area of a rectangle\n"+
                "4... Find the volume of a rectangular prism\n"+
                "5... Determine if a number is prime\n"+
                "6... Exit");
                choice = userInput.nextInt();
        }
        
        //closing statement when choice is 6
        if   (choice == 6)
            {
                System.out.println("!---!---!---!---!---!---!---!---!");
                System.out.println("Program closed");
                System.out.println("!---!---!---!---!---!---!---!---!");
            }
        
    }
    
}
