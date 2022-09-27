package L4_Functions;
import java.util.Scanner;

class SumTwoNums{
    public static void sumTwoNums(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("The sum of "+n1+" and "+n2+" is "+sum+".");
;
        sc.close();
    }
    public static void main(String[] args) {
        sumTwoNums();
        
    }
}