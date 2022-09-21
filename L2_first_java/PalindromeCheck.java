package L2_first_java;
import java.util.Scanner;

public class PalindromeCheck{
    public static void isPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" String is palindrome.");
        }
        else{
            System.out.println(str+" String is not palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        isPalindrome(str);
        sc.close();
        
    }
}