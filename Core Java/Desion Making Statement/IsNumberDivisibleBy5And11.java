// Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
// Input:
// Number = 55

// Output:
// Divisible by 5 and 11

// Explanation:
// If number % 5 == 0 AND number % 11 == 0.

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
