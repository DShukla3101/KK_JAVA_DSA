package L2_first_java;
import java.util.Scanner;

public class ArmstrongNum{

    public static void isArmstrong(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        int r=0;
        while(number > 0){
            r  = number%10;
            sum = sum+(r*r*r);
            number = number/10;
        }
        if(sum == temp){
            System.out.println(temp+" is an Armstrong Number");
        }
        else{
            System.out.println(temp+" Not an Armstrong Number.");
        }

        sc.close();
        
    }
    public static void main(String[] args) {
        isArmstrong();
        
    }
}