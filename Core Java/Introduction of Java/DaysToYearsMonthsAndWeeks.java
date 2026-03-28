
import java.util.Scanner;

// Question 18: Write a Java program to convert days into years, months, and weeks.
public  class DaysToYearsMonthsAndWeeks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter days : ");
        int days = sc.nextInt();

        int years = days/365;
        days %= 365;
        int months = days/30;
        days %= 30;
        int weeks = days/7;
        days %= 7;

        System.out.println("Years : "+years);
        System.out.println("Months : "+months);
        System.out.println("Weeks : "+weeks);
        System.out.println("Days : "+days);
    }
}