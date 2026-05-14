package ai0514;

import java.util.Random;
import java.util.Scanner;

public class ContinueTest04 {
    public static void main(String[] args) {
        /*Scanner s  = new Scanner(System.in);

        int com = (int)(Math.random() * 5 + 1);

        int user;

        System.out.println("=== 숫자 맞히기 게임 ===");
        System.out.println("컴퓨터가 생각한 숫자는?");
        System.out.println("10번 안에 맞혀보세요.");

        for(int i = 1; i <= 10; i++) {

            System.out.printf(i + "번째 입력 : ");
            user = s.nextInt();

            if(user == com){
                System.out.println("정답입니다!");
                System.out.println(i + "번 만에 성공!");
                break;
            }

            if(i == 10 ){
                System.out.println("\n게임 종료!");
                System.out.println("정답은" + com  + "였습니다.");
            }
        }

        s.close();*/

        Scanner s = new Scanner(System.in);
        int i = 1;
        int num = 0;
        int computerNum = 0;
        Random random = new Random();
        while (true) {
            computerNum = random.nextInt(5) + 1;
            System.out.print("게임 " + i + "회: 컴퓨터가 생각한 숫자는 무엇일까요?");
            num = s.nextInt();
            if (computerNum == num) {
                System.out.println("축하합니다. 맞히셨어요!");
                break;
            }

            System.out.println("아까워요. "+ computerNum + "였는데, 다시 도전해 보세요.");
            i++;
        }
            System.out.println("게임을 마칩니다.");
            s.close();
    }
}
