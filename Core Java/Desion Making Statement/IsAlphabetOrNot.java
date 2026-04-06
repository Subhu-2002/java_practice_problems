// Question 6: Write a Java program to check whether a character is alphabetic or not.
// Input:
// Character = A

// Output:
// Alphabet

// Explanation:
// If character lies between A–Z or a–z.

import java.util.Scanner;

public class IsAlphabetOrNot {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a character : ");
            char ch = sc.next().charAt(0);

            if(ch>=97 && ch<=122 || ch>=65 && ch<=90){
                System.out.println("Alphabet");
            }else{
                System.out.println("Not an Alphabet");
            }
        }
    }
}
