// Question 4: Write a Java program to check whether a number is positive, negative or zero.
// Input:
// Number = -5

// Output:
// Negative

// Explanation:
// If number > 0 ? Positive
// If number < 0 ? Negative
// If number = 0 ? Zero

import java.util.Scanner;

public class IsNumPositive_Negative_Zero {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if(num==0){
                System.out.println("Zero");
            }else if(num > 0){
                System.out.println("Positive");
            }else{
                System.out.println("Negative");
            }
        }
    }
}
