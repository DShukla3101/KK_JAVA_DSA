package L2_first_java;

import java.util.Scanner;

public class GreetingBot{
    public static void greetUser(String name){
        System.out.println("Namaste "+name+"!!");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Name!");
        String name = input.next();
        greetUser(name);
        input.close();

    }
}