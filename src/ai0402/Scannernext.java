package ai0402;

import java.util.Scanner;

public class Scannernext {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("========== Simple Calculator ===========");

        System.out.println("정수 1 ==> ");
        int number1 = s1.nextInt();

        System.out.println("정수 2 ==> ");
        int number2 = s1.nextInt();

        System.out.printf("%d + %d = %d\n", number1, number2, number1+number2);
        System.out.printf("%d - %d = %d\n", number1, number2, number1-number2);
        System.out.printf("%d × %d = %d\n", number1, number2, number1*number2);
        System.out.printf("%d ÷ %d = %.2f", number1, number2, (double)number1/number2);
        System.out.printf("%d %% %d = %d\n", number1, number2, number1 % number2);
        s1.close();
    }
}
