// Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
// Input:
// p = 10
// q = 20
// r = 15

// Output:
// Middle Number = 15

// Explanation:
// The middle number is the value that lies between the other two numbers.
// Here, 15 lies between 10 and 20.

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int num1 = sc.nextInt();
            
            System.out.print("Second Number : ");
            int num2 = sc.nextInt();
            
            System.out.print("Third Number : ");
            int num3 = sc.nextInt();

            int middle = num1>num2 && num1<num3 || num1>num3 && num1<num2 ? num1 :
                         num2>num1 && num2<num3 || num2>num3 && num2<num1 ? num2 :
                         num3;

            System.out.println("Middle Number is "+middle);
        }
    }
}
