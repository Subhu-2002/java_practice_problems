// Question 40: Write a Java program to check whether a character is an alphabet, digit, or special character.
// Input:
// Character = @

// Output:
// Special Character

// Explanation:
// If character is between A–Z or a–z ? Alphabet
// If between 0–9 ? Digit
// Otherwise ? Special Character

import java.util.Scanner;

public class AlphabetDigitOrSpecialChar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a char : ");
            char ch = sc.next().charAt(0);

            if(ch>='0' && ch<='9'){
                System.out.println("Digit");
            }else if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
                System.out.println("Alphabet");
            }else{
                System.out.println("Special Character");
            }
        }
    }
}
