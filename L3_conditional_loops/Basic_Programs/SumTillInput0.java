package L3_conditional_loops.Basic_Programs;
import java.util.Scanner;

class SumTillInput0{

    public static void sumAll(){
        int sum = 0;
        int input;
        Scanner sc = new Scanner(System.in);

            while((input = sc.nextInt()) !=0){
                sum = sum+input;

            }
            
        System.out.println("The sum of all the integers is : "+sum);

        sc.close();
    }
    public static void main(String[] args) {
        sumAll();
    }
}