import java.util.Scanner;

public class Underage {
    public static void main(String[] args){
        System.out.println("enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age < 18){
            System.out.println("you are under age");

        }
        else{
            System.out.println("you are not under age");
        }
    }
}
