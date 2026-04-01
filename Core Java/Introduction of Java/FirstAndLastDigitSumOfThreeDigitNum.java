// Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
// Input:
// 123

// Output:
// 4

// Explanation:
// First digit = 1
// Last digit = 3
// Sum = 1 + 3 = 4.

import java.util.Scanner;

public interface FirstAndLastDigitSumOfThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int num = sc.nextInt();

        int first = num / 100;
        int last = num % 10;

        System.out.println("first : " + first);
        System.out.println("last : " + last);
        System.out.println("Sum of first and last digit is : "+(last+first));

        sc.close();
    }
}