
import java.util.Scanner;
public class multiple_of_seven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 ) {
            System.out.println("yes its is multiple of the seven");
        }

        else{
            System.out.println("no its not mulitple of the seven ");
        }

    }
}
