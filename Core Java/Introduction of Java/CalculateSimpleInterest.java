// Question 12: Write a Java program to calculate simple interest.

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal = sc.nextInt();

        System.out.print("Rate : ");
        int rate = sc.nextInt();

        System.out.print("Time : ");
        int time = sc.nextInt();

        int si = (principal*rate*time)/100;

        System.out.println("Simple Interest : "+si);
    }
}
