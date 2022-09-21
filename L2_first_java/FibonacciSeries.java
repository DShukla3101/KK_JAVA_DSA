package L2_first_java;
import java.util.*;

public class FibonacciSeries{
    public static void FiboSeriesTillN(int n){
        int prev = 0;
        int curr = 1;
        System.out.print(prev+" ");
        System.out.print(curr+" ");
        int next = prev+curr;
        while(next<=n){
            next = prev+curr;
            if(next>n){
                break;
            }
            System.out.print(next+" ");
            prev = curr;
            curr = next;
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want the Fibonacci Series : ");
        int n = sc.nextInt();
        FiboSeriesTillN(n);
        sc.close();
    }
}