// Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
// Input:
// m = 25
// n = 12

// Output:
// Difference is greater than 10

// Explanation:
// Absolute difference = |25 ? 12| = 13.
// Since 13 is greater than 10, the condition is true

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int num1 = sc.nextInt();

            System.out.print("Second Number : ");
            int num2 = sc.nextInt();

            int diff = Math.abs(num1-num2);

            if(diff>10){
                System.out.println("Difference is greater than 10");
            }else{
                System.out.println("Difference is equal or less than 10");
            }
        }
    }
}
