import java.util.Scanner;

public class Age {
    static int currentYear = 2020;


    public static void main(String[] args){
        System.out.println("enter the year of birth");
        Scanner scan = new Scanner(System.in);
        int YOB = scan.nextInt();
        int age = currentYear- YOB;
        System.out.println(age);


    }
}
