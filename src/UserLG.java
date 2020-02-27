import java.util.Scanner;

public class UserLG {
    public static void main(String args[]){
        System.out.println("hello Dyson");

        Scanner myScanner = new Scanner(System.in);

        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();
        int num4 = myScanner.nextInt();
        int num5 = myScanner.nextInt();

        int total = num1 + num2+ num3+num4+ num5;
        System.out.println("the total is " + total);
    }
}
