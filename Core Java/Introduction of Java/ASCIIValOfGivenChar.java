
import java.util.Scanner;

// Question 16: Write a Java program to print the ASCII value of a given character
public class ASCIIValOfGivenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a char : ");
        char ch = sc.next().charAt(0);

        System.err.println("ASCII Value of "+ch+" : "+(int)ch);
    }
}
