import java.util.Scanner;

public class Email {
    final static String CORRECT_PASSWORD = "dysonsing@gmail.com";
    static String correctPassword = "nimusiima";

    public static void main(String[] args){
        System.out.println("enter the email");
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        System.out.println("input the password");
        String password = scan.next();

        if (CORRECT_PASSWORD.equals(email)){
            if(password.equals(correctPassword)){
                System.out.println("success");
            }
            else{
                System.out.println("wrong password");
            }

        }
        else{
            System.out.println("wrong email");
        }

    }
}
