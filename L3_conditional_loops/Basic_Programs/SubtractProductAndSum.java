package L3_conditional_loops.Basic_Programs;
import java.util.Scanner;

public class SubtractProductAndSum{

    public static void subtractProductAndSum(int n){
        int sum = 0;
        int product = 1;
        int r = 0;

        while(n>0){
            r = n%10;
            product = product*r;
            sum = sum+r;
             
            n = n/10;
        }
        int ans = product - sum;
        System.out.print("Subtraction of Product and Sum of Digits of the Number = "+ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        subtractProductAndSum(number);

        sc.close();
    }
}