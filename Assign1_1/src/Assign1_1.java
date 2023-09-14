/* Assignment No. 1
 * ----------Question: 1--------------- 
 Accept a integer number and when the program is executed print the
binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : toBinaryString() , toOctalString(), toHexString()
*/



import java.util.Scanner;

public class Assign1_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));

        
    }
}

/*
Output:
Enter Number: 20
Given Number:20
Binary equivalent:10100
Octal equivalent: 24
Hexadecimal equivalent :14
 */

