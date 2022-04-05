
import java.util.Scanner;

public class IfElseProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scan.nextInt();

        if (a < 0 || a > 10)
            System.out.println("Wrong Inputs");

        else {
            String singleUnit[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            if (a < 10)
                System.out.println(singleUnit[a]);

            else {
                System.out.println();
            }

        }

    }

}
