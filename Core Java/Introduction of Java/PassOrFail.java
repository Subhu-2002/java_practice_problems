// Question 48: Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
// Input:
// Marks = 38

// Output:
// Fail

// Explanation:
// If marks ? 40, the result is Pass.
// If marks are below 40, the result is Fail.

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Marks : ");
            int marks = sc.nextInt();

            String res = marks>=40 ? "Pass" : "Fail";

            System.out.println("Your Are "+res);
        }
    }
}
