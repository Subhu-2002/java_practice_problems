// Question 12: Write a Java program to check whether a person is eligible to vote.
// Input:
// Age = 19

// Output:
// Eligible to Vote

// Explanation:
// The minimum voting age is 18 years.
// If age ? 18, the person is eligible.

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your age : ");
            int age = sc.nextInt();

            if(age<18){
                System.out.println("You are not eligible to vote");
            }else{
                System.out.println("You are eligible to vote");
            }
        }
    }
}
