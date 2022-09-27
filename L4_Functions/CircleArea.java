package L4_Functions;
import java.util.Scanner;

public class CircleArea{

    public static void calCircumNArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        double r = sc.nextDouble();

        double circumference = 2 * 3.142 * r;
        System.out.printf("The Circumfrence of the Circle is%, .2f " ,circumference);
        System.out.println();

        double area = 3.142 * r * r;
        System.out.println("The Area of the Circle is "+area);
        sc.close();
    }
    public static void main(String[] args) {
        calCircumNArea();
        
    }
}