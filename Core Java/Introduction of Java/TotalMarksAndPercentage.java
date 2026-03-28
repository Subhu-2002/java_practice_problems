// Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.Scanner;

public class TotalMarksAndPercentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        System.out.print("Enter marks of 5 subjects : ");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        int tot = 0;
        double per = 0.0;
        for(int i=0; i<marks.length; i++){
            tot += marks[i];
            per = tot/(i+1);
        }

        System.out.println("Total : "+tot);
        System.out.println("Percentage : "+per+"%");
    }
}