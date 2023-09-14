/* 
 -------------Assignment 1-------
 -----------Question = 2. -------------
 Accept 2 double values from User (using Scanner). Check data type. If
arguments are not doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
 */


import java.util.Scanner;

public class Assign1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        if (sc.hasNextDouble()) {
            double num1 = sc.nextDouble();

            System.out.print("Enter the Second Number: ");
            if (sc.hasNextDouble()) {
                double num2 = sc.nextDouble();

                double average = (num1 + num2) / 2.0;
                System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);
            } else {
                System.out.println("Error: Second input is not a double.");
            }
        } else {
            System.out.println("Error: First input is not a double.");
        }

    }
}

/*
 * ---------Output----------
 Enter the First Number: 56
Enter the Second Number: 67
Average of 56.0 and 67.0 is: 61.5

Enter the First Number: c
Error: First input is not a double.




*/

