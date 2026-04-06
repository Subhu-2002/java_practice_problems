// Question 11: Write a Java program to find the maximum among three numbers.
// Input:
// A = 10
// B = 25
// C = 15

// Output:
// Maximum = 25

// Explanation:
// The program compares all three numbers using conditional statements and prints the largest value.

import java.util.Scanner;

public class MaxAmongThreeNums {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int n1 = sc.nextInt();
            
            System.out.print("Second Number : ");
            int n2 = sc.nextInt();
            
            System.out.print("Third Number : ");
            int n3 = sc.nextInt();

            if(n1>n2 && n1>n3){
                System.out.println("Maximum : "+n1);
            }else if(n2>n3 && n2>n1){
                System.out.println("Maximum : "+n2);
            }else{
                System.out.println("Maximum : "+n3);
            }
            
        }
    }
}