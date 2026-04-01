// Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
// Input:
// 456

// Output:
// First = 4
// Last = 6

// Explanation:
// The first digit is obtained by dividing the number by 100.
// The last digit is obtained using the modulus operator (% 10).

import java.util.Scanner;

public interface FirstAndLastDigitFromThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int num = sc.nextInt();

        int first = num / 100;
        int last = num % 10;

        System.out.println("first : " + first);
        System.out.println("last : " + last);

        sc.close();
    }
}
