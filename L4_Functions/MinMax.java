package L4_Functions;
import java.util.Scanner;

public class MinMax{
    public static void printMaximum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            if(n2>n3){
                System.out.println(n1 + " is the Max.");
                System.out.println(n3 + " is the Min.");

            }
            else{
                System.out.println(n1 + " is the Max.");
                System.out.println(n2 + " is the Min.");
            }

       
        }

        else if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println(n2 + " is the Max.");
                System.out.println(n3 + " is the Min.");

            }
            else{
                System.out.println(n2 + " is the Max.");
                System.out.println(n1 + " is the Min.");
            }
        }

        else if (n3>n1 && n3>n2){
            if(n1>n2){
            System.out.println(n3 + " is the Max.");
            System.out.println(n2+ " is the Min.");
        }
        else{
            System.out.println(n3+ " is the Max.");
            System.out.println(n1+ " is the Min.");
        }

        sc.close();
    }
}

    
    public static void main(String[] args) {
        printMaximum();

        
    }
}