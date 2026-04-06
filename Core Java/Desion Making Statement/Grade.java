// Question 19: Given marks out of 100, print grade using nested ternary operators.
// Input:
// Marks = 82

// Output:
// Good

// Explanation:
// Grades are assigned based on marks range:
// ? 90 ? Excellent
// ? 75 ? Good
// ? 50 ? Average
// < 50 ? Poor

// Since 82 lies between 75 and 89, the grade is Good.

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Marks : ");
            int marks = sc.nextInt();

            String grade = marks>=90 ? "Excellent" : marks>=75 ? "Good" : marks>=50 ? "Average" : "Poor";

            System.out.println("Grade  :  "+grade);
        }
    }
}
