package L4_Functions;
import java.util.Scanner;

public class PythagoreanTriplet{
    public static void isPythaTriplet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        int n1Sqr = n1*n1;
        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();
        int n2Sqr = n2*n2;
        System.out.print("Enter 3rd Number : ");
        int n3 = sc.nextInt();
        int n3Sqr = n3*n3;
        boolean isTriplet = false;

        if(n1>n2 && n1>n3){
            if(n1Sqr == (n2Sqr + n3Sqr)){
                isTriplet = true;
        }
    }
        else if(n2>n1 && n2>n3){
            if(n2Sqr == (n1Sqr + n3Sqr)){
                isTriplet =  true;
        }
    }
        else{
            if(n3Sqr == (n1Sqr + n2Sqr)){
                isTriplet = true;

        }
    }

        if(isTriplet == true){
            System.out.println("Numbers are Triplets.");
        }
        else{
            System.out.println("Numbers are not Triplets.");
        }
       


        sc.close();
    }

    public static void main(String[] args) {
        isPythaTriplet();
        
    }
}