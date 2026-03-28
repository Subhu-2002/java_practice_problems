// Question 19: Write a Java program that reads a number and displays its cube.
import java.util.Scanner;

public class CubeOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Cube of "+num+" is "+(num*num*num));
    }
}
