// Question 55: Write a Java program to determine bonus based on performance rating.
// Input:
// Rating = 9

// Output:
// 15% Bonus

// Explanation:
// If rating > 8 ? 15% bonus
// If rating between 5 and 8 ? 10% bonus
// Otherwise ? No bonus
// Since rating is 9, employee gets 15% bonus.

import java.util.Scanner;

public class PerformanceBonus {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Rating : ");
            int rating = sc.nextInt();

            int bonus = rating<5 ? 0 : rating <=8 ? 10 : 15;

            System.out.println(bonus+"% Bonus");
        }
    }
}
