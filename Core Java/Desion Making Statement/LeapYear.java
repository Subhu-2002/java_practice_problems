// Question 8: Write a Java program to check whether a year is a leap year or not.
// Input:
// Year = 2024

// Output:
// Leap Year

// Explanation:
// A year is leap if:

// Divisible by 4

// Not divisible by 100 unless divisible by 400

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Year : ");
            int year = sc.nextInt();

            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
