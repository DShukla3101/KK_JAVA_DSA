package L4_Functions;
import java.util.Scanner;

public class PrimeOrNot{
    public static boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        for(int i =2; i<number; i++){
            if(number %i == 0){
                isPrime = false;
            }
        }
        
        return isPrime;
    }
    public static void main(String[] args) {
        boolean primeCheck = isPrime();
        if(primeCheck == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        
    }
    }}