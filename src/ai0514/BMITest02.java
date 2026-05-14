package ai0514;

import java.util.Scanner;

public class BMITest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("======== BMI(Body Index Mass) =========");

            System.out.print("* 성명 입력(exit 입력 시 종료): ");
            String name = s.nextLine();

            // exit 입력 시 종료
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("* 체중(㎏, 실수값)을 입력하세요.: ");
            double weight = s.nextDouble();

            System.out.print("* 키(㎝, 실수값)를 입력하세요.: ");
            double height = s.nextDouble();

            s.nextLine(); // 입력 버퍼 정리

            // bmi 지수 구하기
            double bmi = weight / Math.pow(height / 100, 2);

            String result1, result2;

            if (bmi < 18.5) {
                result1 = "저체중";
                result2 = "식이요법과 운동을 통해 체중을 증량시켜야 합니다.";
            } else if (bmi < 22.9) {
                result1 = "정상";
                result2 = "현재 상태를 유지하세요.";
            } else if (bmi < 29.9) {
                result1 = "비만";
                result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다.";
            } else {
                result1 = "고도비만";
                result2 = "전문가의 도움을 받아 체중을 감량하시기 바랍니다.";
            }

            System.out.printf("* %s님의 BMI 지수 결과: %.2f㎏/㎡\n", name, bmi);
            System.out.printf("* %s : %s\n\n", result1, result2);
        }

        s.close();
    }
}
