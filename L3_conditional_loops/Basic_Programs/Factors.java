package L3_conditional_loops.Basic_Programs;
import java.util.Scanner;

public class Factors{

    public static void printFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("The factors of "+n+" are ");
       for(int i=1; i<=n;i++){
        if(n%i == 0){
            System.out.print(i+" ");
        }
       }
        sc.close();
    }
    public static void main(String[] args) {
        printFactors();
        
    }
}