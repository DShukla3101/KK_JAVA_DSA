package L4_Functions;
// import java.util.Scanner;

public class PrimeNumsInRange{
    public static void printNums(int start, int end){
      

        System.out.println("Prime Number/s between "+start+" and "+end+ " are ");
        
        int num = start + 1;
        for(int i=num; i<end; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    continue;
                }
            }
            if(isPrime == true){
                System.out.println(i);
            }
        }
   }

        // sc.close();

    public static void main(String[] args) {
        printNums(45,100);
    }
}