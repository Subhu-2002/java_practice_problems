// Question 1: Write a Java program to check whether a number is even or odd.
// Input:
// Number = 8

// Output:
// Even

// Explanation:
// If a number is divisible by 2, it is Even. Otherwise, it is Odd.

import java.util.Scanner;

class EvenOdd{
    public static void main(String ar[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int num = sc.nextInt();

            String res = num%2==0 ? "Even" : "Odd";

            System.out.println(res);
        }
    }
}