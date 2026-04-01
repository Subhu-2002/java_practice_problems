// Question 31: Write a Java program to check whether a given number is even or odd.
// Input:
// Number = 12

// Output:
// Even

// Explanation:
// A number is even if it is divisible by 2 (remainder 0).
// If the remainder is not 0, the number is odd.

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if(num%2 == 0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
}