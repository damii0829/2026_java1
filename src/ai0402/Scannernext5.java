package ai0402;

import java.util.Scanner;

public class Scannernext5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("필기시험 점수를 입력하세요: ");
        int score = s1.nextInt();

        if(score >= 70)
        {
            System.out.println("합격입니다.");
        }
        else
        {
            System.out.println("불합격입니다.");
        }
        s1.close();
    }
}
