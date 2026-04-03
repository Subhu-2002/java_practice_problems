// Question 45: Write a Java program to find the minimum between two numbers.
// Input:
// A = 8
// B = 12

// Output:
// Minimum = 8

// Explanation:
// The program compares both numbers and prints the smaller one.

import java.util.Scanner;

public class MinBetweenTwoNums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int n1 = sc.nextInt();

            System.out.print("Second Number : ");
            int n2 = sc.nextInt();

            int min = n1<n2 ? n1 : n2;

            System.out.println("Minimum : "+min);
        }
    }
}
