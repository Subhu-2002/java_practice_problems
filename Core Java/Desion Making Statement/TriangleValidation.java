// Question 2: Write a Java program to check whether a triangle is valid or not.
// Input:
// A = 5, B = 6, C = 7

// Output:
// Valid Triangle

// Explanation:
// A triangle is valid if the sum of any two sides is greater than the third side.

import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Side 1 : ");
            int side1 = sc.nextInt();
            
            System.out.print("Side 2 : ");
            int side2 = sc.nextInt();
            
            System.out.print("Side 3 : ");
            int side3 = sc.nextInt();

            if(side1<side2+side3 && side2<side1+side3 && side3<side1+side3){
                System.out.println("Valid Triangle");
            }else{
                System.out.println("Invalid Triangle");
            }
        }
    }
}
