// Question 54: Write a Java expression using arithmetic and assignment operators to calculate net salary.
// Input:
// Basic Salary = 35000
// Tax Rate = 12%

// Output:
// Net Salary = 30800

// Explanation:
// Tax amount = 12% of 35000 = 4200
// Net Salary = 35000 ? 4200 = 30800.

import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Basic Salary : ");
            int bSal = sc.nextInt();

            System.out.print("Tax Rate : ");
            int tax = sc.nextInt();

            double netSal = bSal- bSal*tax/100;

            System.out.println("Net Salary : "+netSal);
        }
    }
}
