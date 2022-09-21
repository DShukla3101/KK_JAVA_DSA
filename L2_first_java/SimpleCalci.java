package L2_first_java;
import java.util.Scanner;

public class SimpleCalci{

    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter any one of the Operation(+, -, *, /) : ");
        String operation = sc.next();
        
        double result = 0.0;

        if(operation.equals("+")){
            result = num1 + num2;

        }
        else if(operation.equals("-")){
            result = num1 - num2;

        }

        else if(operation.equals("*")){
            result = num1 * num2;

        }
        else if(operation.equals("/")){
            result = num1 / num2;

        }
        else{
            System.out.print("Invalid Operator!! Please Enter any on of the following operations(+, -, *, /).");
        }
        System.out.println("Ans = "+result);



        sc.close();
    }
    public static void main(String[] args) {
        calculator();
        
    }

}