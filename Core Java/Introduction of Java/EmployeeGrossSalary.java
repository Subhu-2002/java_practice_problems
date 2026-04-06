// Question 14: Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
//                   Basic Salary <= 10000 : HRA = 20%, DA = 80%
//                   Basic Salary <= 20000 : HRA = 25%, DA = 90%
//                    Basic Salary > 20000 : HRA = 30%, DA = 95%
// Input:
// Basic Salary = 15000

// Output
// Gross Salary = 32250

// Explanation:
// Since 15000 ? 20000:
// HRA = 25% of 15000 = 3750
// DA = 90% of 15000 = 13500

// Gross Salary = 15000 + 3750 + 13500 = 32250

import java.util.Scanner;

public class EmployeeGrossSalary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Basic Salary : ");
            int bSal = sc.nextInt();

            double gSal = 0;
            if(bSal<0){
                System.out.println("Wrong Salary Input");
            }else if(bSal<=10000){
                gSal = bSal+(bSal*0.2)+(bSal*0.8);
            }else if(bSal<=20000){
                gSal = bSal+(bSal*0.25)+(bSal*0.9);
            }else{
                gSal = bSal+(bSal*0.3)+(bSal*0.95);
            }

            System.out.println("Gross Salary : "+gSal);
        }
    }
}
