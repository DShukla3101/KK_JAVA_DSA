package L3_conditional_loops.Intermediate_Programs;
import java.util.Scanner;

public class AverageOfNnums{

    public static void averageFinder(){
        Scanner sc = new Scanner(System.in);
        int input;
        int summation = 0;
        int tNumbers = 0;
        System.out.println("Note : Enter 0 to (Exit) get the Average.");
        System.out.println("Enter the numbers : ");
        while((input = sc.nextInt()) != 0){
            summation = summation + input;
            tNumbers++;
        }
        double result = summation/tNumbers;
        System.out.printf("The average of entered numbers is%, .2f", result+".");
        
        sc.close();

    }
    public static void main(String[] args) {
        averageFinder();
        
    }
}