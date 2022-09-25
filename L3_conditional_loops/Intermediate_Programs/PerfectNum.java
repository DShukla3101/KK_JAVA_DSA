package L3_conditional_loops.Intermediate_Programs;

import java.util.Scanner;

class PerfectNum {

    public static void perfectNumCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else{

            System.out.println(n + " is not a perfect number.");
    }

    sc.close();

    }

    public static void main(String[] args) {
        perfectNumCheck();

    }

}