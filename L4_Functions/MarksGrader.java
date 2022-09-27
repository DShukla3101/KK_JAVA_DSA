package L4_Functions;
import java.util.Scanner;

class MarksGrader{
    public static void gradeAccMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();

        if(marks>100 || marks < 0){
            System.out.println("Invalid Marks !!");
        }

        else if(marks <=100 && marks >90){
            System.out.println("Your Grade is AA.");
        }
        else if(marks <90 && marks >80){
            System.out.println("Your Grade is AB.");
        }

        else if(marks <80 && marks >70){
            System.out.println("Your Grade is BB.");
        }

        else if(marks <70 && marks >60){
            System.out.println("Your Grade is BC.");
        }

        else if(marks <60 && marks >50){
            System.out.println("Your Grade is CD.");
        }

        else if(marks <50 && marks >40){
            System.out.println("Your Grade is DD.");
        }
        else{
            System.out.println("Fail");
        }


        sc.close();
    }
    public static void main(String[] args) {
        gradeAccMarks();
        
    }
}