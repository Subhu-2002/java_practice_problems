// Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
// Input:
// Side1 = 5
// Side2 = 5
// Side3 = 5

// Output:
// Equilateral Triangle

// Explanation:
// If all three sides are equal ? Equilateral.
// If any two sides are equal ? Isosceles.
// If all sides are different ? Scalene

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Side 1 : ");
            int side1 = sc.nextInt();
            
            System.out.print("Side 2 : ");
            int side2 = sc.nextInt();
            
            System.out.print("Side 3 : ");
            int side3 = sc.nextInt();

            if(side1==side2 && side2==side3){
                System.out.println("Equilateral Triangle");
            }else if(side1==side2 || side1==side3 || side2==side3){
                System.out.println("Isosceles Triangle");
            }else{
                System.out.println("Scalene Triangle");
            }
        }
    }
}
