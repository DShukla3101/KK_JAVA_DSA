package L3_conditional_loops.Intermediate_Programs;
import java.util.Scanner;

public class Factorial{

    public static int returnFactorial( int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact = fact * i;
        }        
        return fact;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int factorial = returnFactorial(number);
            System.out.println(factorial);
            sc.close();
    }
}