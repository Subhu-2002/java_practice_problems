// Question 47: Write a Java program to find the minimum among three numbers.
// Input:
// A = 6
// B = 3
// C = 9

// Output:
// Minimum = 3

// Explanation:
// The program compares all three numbers using conditional statements and prints the smallest value.

import java.util.Scanner;

public class MinAmongThreeNums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int n1 = sc.nextInt();
            
            System.out.print("Second Number : ");
            int n2 = sc.nextInt();
            
            System.out.print("Third Number : ");
            int n3 = sc.nextInt();

            if(n1<n2 && n1<n3){
                System.out.println("Minimum : "+n1);
            }else if(n2<n3 && n2<n1){
                System.out.println("Minimum : "+n2);
            }else{
                System.out.println("Minimum : "+n3);
            }
        }
    }
}
