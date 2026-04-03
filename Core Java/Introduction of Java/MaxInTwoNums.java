// Question 46: Write a Java program to find the maximum between two numbers.
// Input:
// A = 6
// C = 9

// Output:
// Minimum = 9

// Explanation:
// The program compares two numbers using conditional statements and prints the largest value.


import java.util.Scanner;

public class MaxInTwoNums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int n1 = sc.nextInt();

            System.out.print("Second Number : ");
            int n2 = sc.nextInt();

            int max = n1>n2 ? n1 : n2;

            System.out.println("Maximum : "+max);
        }
    }
}
