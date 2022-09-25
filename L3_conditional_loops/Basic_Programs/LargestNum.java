package L3_conditional_loops.Basic_Programs;
import java.util.Scanner;

public class LargestNum {

    public static void printLargestNumer(){
        Scanner sc = new Scanner(System.in);
        int input;
        int max = 0;
        System.out.println("Enter your number : ");

        while((input = sc.nextInt()) != 0){
            if(input>max){
                max = input;
            }
        }
        System.out.println("The largest number is = "+max);

        sc.close();
    }
    public static void main(String[] args) {
        printLargestNumer();
        
    }
    
}
