// Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
// Input:
// Number = 49

// Output
// Perfect Square

// Explanation:
// Square root of 49 is 7, which is an integer.
// Therefore, 49 is a Perfect Square.
// If the square root contains a decimal value, then it is not a Perfect Square.

import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number : ");
            int num = sc.nextInt();

            double res = Math.sqrt(num);

            if(res*res == num){
                System.out.println("Prefect Square");
            }else{
                System.out.println("Not a Perfect Square");
            }
        }
    }
}
