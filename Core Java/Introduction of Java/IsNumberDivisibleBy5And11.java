// Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
// Input:
// Number = 55

// Output:
// Divisible by 5 and 11

// Explanation:
// A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.

import java.util.Scanner;

public class IsNumberDivisibleBy5And11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if(num%11==0 && num%5==0){
                System.out.println("Divisible by both 5 and 11");
            }else if(num%5==0){
                System.out.println("Divisible by 5 only");
            }else if(num%11==0){
                System.out.println("Divisible by 11 only");
            }else{
                System.out.println("Not Divisible by both 5 and 11");
            }
        }
    }
}
