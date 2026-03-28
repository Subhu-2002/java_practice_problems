
import java.util.Scanner;

// Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
public class SecondsToHrsMinsAndSecs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds : ");
        int secs = sc.nextInt();

        int hrs = secs/3600;
        secs %= 3600;
        int mins = secs/60;
        secs %= 60;

        System.out.println("Hours : "+hrs);
        System.out.println("Minutes : "+mins);
        System.out.println("Seconds : "+secs);
    }
}
