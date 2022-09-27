package L4_Functions;
import java.util.Scanner;


public class FactorialMethod{
    public static void calcFactorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int fact = 1;
        if(number == 0){
            System.out.println("Factorial of 0 is "+fact+"."); 
        }
        else{
        for(int i=1; i<=number ; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+number+" is "+fact+".");


        sc.close();
    }
}

    public static void main(String[] args) {
        calcFactorial();
    }

}