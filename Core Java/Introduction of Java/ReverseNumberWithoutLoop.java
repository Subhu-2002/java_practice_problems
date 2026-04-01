// Question 21: Write a Java program to reverse a number without using a loop.

import java.util.Scanner;

public class ReverseNumberWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int num = sc.nextInt();

        // Loose Original Number
        // int last = num%10;
        // num /= 10;
        // int middle = num%10;
        // num /= 10;
        // int first = num;

        int last = num%10;
        int middle = (num/10)%10;
        int first = num/100;

        System.out.println("Reverse of "+num+" is "+(last*100 + middle*10 + first));
        sc.close();
    }
}