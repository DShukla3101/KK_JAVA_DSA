package L4_Functions;
import java.util.Scanner;

public class SumNaturalNums {
    public static void printSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number till which you want the summation of natural numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;

        }
        System.out.println("The Summation of Natural Numbers till "+n+" is "+sum+".");


        sc.close();
    }
    public static void main(String[] args) {
        printSum();
        
    }
    
}
