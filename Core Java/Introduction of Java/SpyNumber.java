
import java.util.Scanner;

// Question 26: Write a Java program to check whether a number is a Spy number.
// Input:
// 1412

// Output:
// Spy Number

// Explanation:
// A Spy number is a number where the sum of digits equals the product of digits.
// Sum = 1 + 4 + 1 + 2 = 8
// Product = 1 × 4 × 1 × 2 = 8.

public class SpyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            
            int sum = 0;
            int prod = 1;
            int temp = num;
            while(temp != 0){
                int dig = temp%10;
                sum += dig;
                prod *= dig;
                temp /= 10;
            }
            
            if(sum == prod){
                System.out.println("Spy Number");
            }else{
                System.out.println("Not a Spy Number");
            }
        }
    }
}
