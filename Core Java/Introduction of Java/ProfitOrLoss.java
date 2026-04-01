// Question 37: Write a Java program to input cost price and selling price and determine profit or loss.
// Input:
// Cost Price = 500
// Selling Price = 650

// Output:
// Profit

// Explanation:
// If selling price > cost price ? Profit
// If selling price < cost price ? Loss
// If both are equal ? No Profit No Loss

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
