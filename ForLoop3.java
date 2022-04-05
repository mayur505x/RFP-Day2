import java.util.Scanner;

class ForLoop3 {
    public static <temp> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int i = scan.nextInt();
        int orig = i;
        int rev = 0;

        for (; i != 0; i /= 10) {
            int rem = i % 10;
            rev = rev * 10 + rem;

        }

        System.out.println("Reverse value:" + rev);

        if (orig == rev)
            System.out.println("Palindrome");
			
        else {
            System.out.println("not Palindrome");
			
        }

    }

}