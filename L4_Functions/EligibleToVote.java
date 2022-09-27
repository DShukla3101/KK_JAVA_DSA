package L4_Functions;
import java.util.Scanner;

class EligibleToVote{
    public static void isEligible(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println(name+ ", you are eligible to vote.");
        }
        else{
            System.out.println(name+", you are not eligible to vote. Please come back after "+(18-age)+" years.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        isEligible();
        
    }
}