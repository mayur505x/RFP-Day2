import java.util.Scanner;

class Operator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        System.out.println("Enter third number:");
        int c = scan.nextInt();

        int m = a + b * c;
        System.out.println(m);
        int n = c + a / b;
        System.out.println(n);
        int o = a % b + c;
        System.out.println(o);
        int p = a * b + c;
        System.out.println(p);

        System.out.println("minimum " + Math.min(m, n));
        System.out.println("maximum " + Math.max(m, n));

    }

}

