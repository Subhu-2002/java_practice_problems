
import java.util.Scanner;

// Question 13: Write a Java program to calculate compound interest.
public class CalculateCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal = sc.nextInt();

        System.out.print("Rate : ");
        int rate = sc.nextInt();

        System.out.print("Time : ");
        int time = sc.nextInt();

        double CI = principal*(Math.pow((1+rate/100.0), time))-principal;

        System.out.println("Compound Interest : "+CI);

    }
}
