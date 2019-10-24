package s;
import java.util.Scanner;
public class cla12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Provide a number: ");
            int number = scan.nextInt();

            System.out.println(number);
            if (number < 0) {
                System.out.println("Negative");
            }
            if (number > 0) {
                System.out.println("Positive");
            }
            if (number == 0) {
                System.out.println("it's ZERO");
            }
        }


    }

