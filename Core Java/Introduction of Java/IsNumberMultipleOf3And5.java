
import java.util.Scanner;

public class IsNumberMultipleOf3And5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if(num%3==0 && num%5==0){
                System.out.println("Divisible by both 3 and 5");
            }else if(num%3==0){
                System.out.println("Divisible by 3 only");
            }else if(num%5==0){
                System.out.println("Divisible by 5 only");
            }else{
                System.out.println("Not Divisible by both 3 and 5");
            }
        }
    }
}
