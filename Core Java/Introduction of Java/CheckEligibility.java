// Question 52: Write a Java program to check eligibility based on percentage and income.
// Input:
// Percentage = 78
// Income = 180000

// Output:
// Eligible

// Explanation:
// Eligibility condition:
// Percentage ? 75 and Income < 200000.
// Both conditions are satisfied.

import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Percentage : ");
            int per = sc.nextInt();

            System.out.print("Income : ");
            int income = sc.nextInt();

            String isEligible = per>75 && income<200000 ? "Eligible" : "Not Eligible";

            System.out.println(isEligible);
        }
    }
}
