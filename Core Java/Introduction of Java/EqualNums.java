// Question 43: Write a Java program to accept two integers and check whether they are equal.
// Input:
// A = 50
// B = 50

// Output:
// Equal

// Explanation:
// If both numbers have the same value, they are equal; otherwise, they are not equal.

import java.util.Scanner;

public class EqualNums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("First Number : ");
            int n1 = sc.nextInt();

            System.out.print("Second Number : ");
            int n2 = sc.nextInt();


            if(n1 == n2){
                System.out.println("Equal");
            }else{
                System.out.println("Not Equal");
            }
        }
    }
}
