import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name");
        String name = scan.next();
        System.out.println("enter the age");
        int age = scan.nextInt();
        String message = name + " is " + age + " years old";
        System.out.println(message);

    }
}
