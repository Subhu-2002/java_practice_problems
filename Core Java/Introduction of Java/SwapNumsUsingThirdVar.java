
import java.util.Scanner;

// Question 14: Write a Java program to swap two numbers using a third variable.
public class SwapNumsUsingThirdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number : ");
        int num2 = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
        System.out.println();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap");
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
    }
}
