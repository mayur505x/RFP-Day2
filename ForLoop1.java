public class ForLoop1 {
    public static void main(String[] args) {

        int i;
        int num = 5;
        int sum = 0;

        for (i=1;i<=num;i++) {
            System.out.println(i);

            sum = sum + i;

        }

        System.out.println("Sum of 5 number :" + sum);
    }

}

