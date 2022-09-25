package L3_conditional_loops.Intermediate_Programs;
import java.util.Scanner;

public class PalindromeNumber{
    public static void palindromeNumCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int temp = number;
        int ans = 0;
        while(number>0){
            int rem = number % 10;
            number = number / 10;

            ans = ans * 10 + rem;

        }
        if(temp == ans ){
            System.out.println(temp + " is a Palindrome Number.");
        }
        else System.out.println(temp + " is not a Palindrome Number.");

        sc.close();
    } 
    public static void main(String[] args) {
        palindromeNumCheck();
        
    }
}