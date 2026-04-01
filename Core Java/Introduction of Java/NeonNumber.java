// Question 24: Write a Java program to check whether a number is a Neon number or not.
// Input:
// 9

// Output:
// Neon Number

// Explanation:
// A Neon number is a number where the sum of digits of its square is equal to the number itself.
// 9² = 81 ? 8 + 1 = 9.

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sqr = num*num;
        int sum = 0;
        while(sqr != 0){
            sum += sqr%10;
            sqr /= 10;
        }

        if(sum == num){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not a Neon Number");
        }
    }
}
