import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Month= ");
        int month = scan.nextInt();

        System.out.println("Day= ");
        int day = scan.nextInt();

        boolean True =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(True);

    }

}