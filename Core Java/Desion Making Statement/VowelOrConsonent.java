// Question 9: Write a Java program to input an alphabet and check whether it is a vowel or consonant.
// Input:
// Alphabet = e

// Output:
// Vowel

// Explanation:
// Vowels are a, e, i, o, u (both uppercase and lowercase).
// All other alphabets are consonants.

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter an alphabet : ");
            char ch = sc.next().charAt(0);

            switch(ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println("Vowel");
                    break;
                
                default:
                    if(ch>=97 && ch<=122 || ch>=65 && ch<=90){
                        System.out.println("Consonent");
                    }else{
                        System.out.println("Not an alphabet");
                    }
            }
        }
    }
}
