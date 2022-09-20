package L2_first_java;
import java.util.Scanner;

public class EvenOrOdd{

    public static boolean isEven(int num){
        
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        } 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want check : ");
        int num = sc.nextInt();
        sc.close();
        boolean isEven = isEven(num);
        if(isEven == true){
            System.out.println(num + " is an Even Number.");
        }
        else {
            System.out.println(num+ " is an Odd Number.");
        }
        
    }
}