// Question 28: Write a Java program to calculate the net salary of an employee.
// Input:
// Basic = 20000
// HRA = 10%
// DA = 5%
// Tax = 2%

// Output:
// Net Salary = 22600

// Explanation:
// HRA and DA are calculated as percentages of the basic salary and added to it.
// Tax is deducted after adding allowances to compute the final net salary.

import java.util.Scanner;

public class NetSalaryOfAnEmployee {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Details");
            System.out.print("Basic Salary : ");
            int bSal = sc.nextInt();

            System.out.print("HRA : ");
            int hra = sc.nextInt();

            System.out.print("DA : ");
            int da = sc.nextInt();

            System.out.print("TAX : ");
            int tax = sc.nextInt();

            double netSal = bSal + ((bSal*hra/100) + (bSal*da/100) - (bSal*tax/100));

            System.out.println("Net Salary : "+netSal);
        }
    }
}
