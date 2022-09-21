package L2_first_java;
import java.util.Scanner;

public class SimpleInterestCal{
    public static void calculateSI(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        int principalAmnt = sc.nextInt();

        System.out.print("Enter the Rate : ");
        int rate = sc.nextInt();

        System.out.print("Enter for How many year : ");
        int time = sc.nextInt();

        double simpleInterest = (principalAmnt * rate * time)/100;

        System.out.println("Simple Interest = "+simpleInterest);

        System.out.println("Do you wish to calculate Accrued Amount(Principal Amount + Simple Interest). Enter 1 to calculate and 0 to exit.");

        int _0or1  = sc.nextInt();
        if(_0or1 == 1){
            double AccruedAmnt = simpleInterest+principalAmnt;
            System.out.println("Accrued Amount = "+AccruedAmnt);
        }

        sc.close();
    }


    public static void main(String[] args) {
        calculateSI();
        
    }
}
    
