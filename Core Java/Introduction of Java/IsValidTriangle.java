// Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
// Input:
// Angle1 = 60
// Angle2 = 60
// Angle3 = 60

// Output:
// Valid Triangle

// Explanation:
// A triangle is valid only if the sum of all three angles is exactly 180°.
// 60 + 60 + 60 = 180, so it is valid.

import java.util.Scanner;

public class IsValidTriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Angle 1 : ");
            int ang1 = sc.nextInt();

            System.out.print("Angle 2 : ");
            int ang2 = sc.nextInt();

            System.out.print("Angle 3 : ");
            boolean isValid = sc.nextInt() == (180-ang1-ang2);

            if(isValid){
                System.out.println("Valid Triangle");
            }else{
                System.out.println("Invalid Triangle");
            }
        }
    }
}
