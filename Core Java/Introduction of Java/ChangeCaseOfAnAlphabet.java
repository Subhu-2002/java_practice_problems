// Question 27: Write a Java program to toggle the case of an alphabet using ASCII values.
// Input:
// a

// Output:
// A

// Explanation:
// Lowercase and uppercase letters differ by 32 in ASCII values.
// By adding or subtracting 32, the case of the alphabet can be changed.

import java.util.Scanner;

public class ChangeCaseOfAnAlphabet {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a character : ");
            char ch = sc.next().charAt(0);

            if(ch>=65 && ch<=90){
                ch += 32;
                System.out.println(ch);
            }else if(ch>=97 && ch<=122){
                ch -= 32;
                System.out.println(ch);
            }else{
                System.out.println(ch+" is not an alphabet");
            }
        }
    }
}
