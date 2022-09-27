package L4_Functions;
import java.util.Scanner;

public class ProductTwoNums{
    public static int returnProduct(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();
        sc.close();

        int sum = n1 * n2;
        return sum;
    }
    public static void main(String[] args) {
        int res = returnProduct();
        System.out.println("The Product of numbers is "+res+".");
    }
}