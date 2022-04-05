import java.util.Scanner;

public class Day2Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scan.nextInt();

        if (a < 0 || a > 1000)
            System.out.println("Wrong Inputs");

        else if (a == 1 || a == 10) {
            if (a == 1)
                System.out.println("one");

            else if (a == 10) {
                System.out.println("Ten");
            }

        } else {
            if (a == 100)
                System.out.println("Hundred");

            else if (a == 1000)
                System.out.println("Thousand");
        }

    }

}
