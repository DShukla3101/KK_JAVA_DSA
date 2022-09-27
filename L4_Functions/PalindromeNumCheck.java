package L4_Functions;
import java.util.Scanner;

public class PalindromeNumCheck{
    public static void palindromeNumCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int rem;
        int rev = 0;
        while(number>0){
            rem = number % 10;
            number = number/10;
            rev = rev * 10 + rem;
        }
        if(temp == rev){
            System.out.println(temp+" is a Palindrome Number.");
        }
        else{
            System.out.println(temp+ " is Not a Palindrome Number.");
        }

        sc.close();
    }
    
    
    public static void main(String[] args) {
        palindromeNumCheck();
        
    }
}