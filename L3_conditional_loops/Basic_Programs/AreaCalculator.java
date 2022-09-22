package L3_conditional_loops.Basic_Programs;

import java.util.Scanner;

public class AreaCalculator{
    public static void areaCal(){
    Scanner sc = new Scanner(System.in);
    System.out.println("You want to calculate Area of( Ex. enter 1 to calculate Area of Circle, 2 to calculate Area of Triangle, and so on... )  \n 1 => Circle \n 2 => Triangle \n 3 => Rectangle\n 4 => Parallelogram \n 5 => Equilateral Triangle \n Please enter your choice : " );
    int areaOf = sc.nextInt();

    switch(areaOf){
        case 1:
        System.out.print("Enter radius of circle : ");
        double radius = sc.nextDouble();
        double areaOfCircle = 3.142 * radius*radius;
        System.out.print("Area of Circle = "+areaOfCircle);
        break;

        case 2:
        System.out.print("Enter base of triangle : ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle : ");
        double height = sc.nextDouble();

        double areaOfTriangle = 0.5 * base * height;

        System.out.print("Area of Triangle = "+areaOfTriangle);
        break;

        case 3:
        System.out.print("Enter length of Rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle : ");
        double width = sc.nextDouble();
        double areaOfRectangle = length * width;
        System.out.print("Area of Triangle = "+areaOfRectangle);
        break;

        case 4:
        System.out.print("Enter base of Parallelogram : ");
        double pBase = sc.nextDouble();
        System.out.print("Enter height of Parallelogram : ");
        double pHeight = sc.nextDouble();

        double areaOfParallelogram = pBase * pHeight;

        System.out.print("Area of Parallelogram = "+areaOfParallelogram);
        break;

        

        case 5:
        System.out.print("Enter side length of the Equilateral Triangle : ");
        double sideLength = sc.nextDouble();
        double areaOfEquiTriangle = (1.732*sideLength*sideLength)/4;
        System.out.print("Area of Triangle = "+areaOfEquiTriangle);
        break;

        default :
        System.out.println("Invalid Input!!");

        }
        sc.close();

    }
    public static void main(String[] args) {
        areaCal();
        
    }
}