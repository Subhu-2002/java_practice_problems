// Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
// Input:
// Cost Price = 500
// Selling Price = 650

// Output:
// Profit

// Explanation:
// If SP > CP ? Profit
// If SP < CP ? Loss

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Cost Price : ");
            int cost = sc.nextInt();

            System.out.print("Selling Price : ");
            int sell = sc.nextInt();

            if(sell>cost){
                System.out.println("Profit");
            }else if(cost>sell){
                System.out.println("Loss");
            }else{
                System.out.println("No Profit No Loss");
            }
        }
    }
}
