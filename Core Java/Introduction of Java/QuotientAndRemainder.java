// Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
// Input:
// Dividend = 20
// Divisor = 3

// Output:
// Quotient = 6
// Remainder = 2

// Explanation:
// The division operator (/) gives the quotient.
// The modulus operator (%) gives the remainder.

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Dividend : ");
            int dividend = sc.nextInt();

            System.out.print("Divisor : ");
            int divisor = sc.nextInt();

            System.out.println("Quotient : "+(dividend/divisor));
            System.out.println("Remainder : "+(dividend%divisor));
        }
    }
}
