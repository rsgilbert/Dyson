import java.util.Scanner;

public class Dyson {
    public static void main(String[] args){
        Scanner dyScanner = new Scanner(System.in);
        int max = 0 ;

        for (int i=0; i<5; i++){
            int input = dyScanner.nextInt();
            if(i ==0){
                max = input;
            }
            if(input > max){
                max = input;
            }
        }
        System.out.println(max);
    }
}
