package L2_first_java;
import java.util.Scanner;

public class CurrencyCon{

    public static void rupeesToUSD(){
        System.out.print("Enter the rupees you want to convert into USD : ");
        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        double dollar = rupees/79.93;
        System.out.println(rupees+" rupees is "+dollar+" Dollar.");


        sc.close();
    }

    public static void main(String[] args) {
        rupeesToUSD();
        
    }
}