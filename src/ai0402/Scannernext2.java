package ai0402;

import java.util.Scanner;

public class Scannernext2 {
    public static void main(String[] args) {
        /*Scanner s1 = new Scanner(System.in);

        //파운드 -> 킬로그램
        System.out.print("파운드(lb를 입력하세요:");
        double lb = s1.nextDouble();
        double kg = (lb * 0.453592);

        System.out.println(lb + "파운드(lb)는" + kg + "킬로그램");

        // 킬로그램 → 파운드
        System.out.print("킬로그램(kg)을 입력하세요: ");
        double kgInput = s1.nextDouble();
        double lbResult = kgInput * 2.204623;

        System.out.println(kgInput + "킬로그램(kg)은 " + lbResult + "파운드(lb)입니다.");

        s1.close();*/

        Scanner s = new Scanner(System.in);
        double lb = 0.453592;
        double kg = 2.204623;
        double result = 0;

        System.out.println(" ===== 파운드/킬로그램 단위 변환기 ===== ");
        System.out.print("파운드(lb) 값 입력:");
        int input1 = s.nextInt();
        result = input1 * lb;
        System.out.printf("%d 파운드(lb)는 %.3f킬로그램(kg)입니다.\n", input1, result);

        System.out.print("킬로그램(kg) 값 입력:");
        int input2 = s.nextInt();
        result = input2 * kg;
        System.out.printf("%d킬로그램(kg)은 %.3f파운드(lb) 입니다.\n", input2, result);

        s.close();

    }
}
