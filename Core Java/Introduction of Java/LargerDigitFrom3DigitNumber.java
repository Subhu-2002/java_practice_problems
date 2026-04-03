// Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
// Input:
// Number = 582

// Output:
// Larger Digit = 5

// Explanation:
// First digit = 5
// Last digit = 2
// Since 5 > 2, the larger digit is 5.

import java.util.Scanner;

public class LargerDigitFrom3DigitNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number : ");
            int num = sc.nextInt();

            int first = num/100;
            int last = num%100;

            int res = first>last ? first : last;

            System.out.println("Larger Digit : "+res);
        }
    }
}
