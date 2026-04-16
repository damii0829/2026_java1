package ai0402;

import java.util.Scanner;

public class Scannernext4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int total = 0;

        // 삼각김밥
        System.out.print("삼각김밥 판매 개수: ");
        int kimbap = s1.nextInt();
        total += (1400 - 900) * kimbap;

        // 바나나우유
        System.out.print("바나나우유 판매 개수: ");
        int bananaMilk = s1.nextInt();
        total += (1800 - 800) * bananaMilk;

        // 도시락
        System.out.print("도시락 판매 개수: ");
        int lunchBox = s1.nextInt();
        total += (4000 - 3500) * lunchBox;

        // 콜라
        System.out.print("콜라 판매 개수: ");
        int cola = s1.nextInt();
        total += (1500 - 700) * cola;

        // 새우깡
        System.out.print("새우깡 판매 개수: ");
        int shrimpSnack = s1.nextInt();
        total += (2000 - 1000) * shrimpSnack;

        // 캔커피
        System.out.print("캔커피 판매 개수: ");
        int coffee = s1.nextInt();
        total += (1800 - 500) * coffee;

        System.out.println("오늘 총 매출액은 " + total + "원입니다.");

        s1.close();


        /*int total = 0;
        *total -= 900 * 10;
        * total += 1800 * 2;
        * total -= 3500 * 5;
        * total += 4000 * 4;
        * total += 1500;
        * total += 2000 * 4;
        * total += 1800 * 5;
        *
        * System.out.println("편의점 총매출액: " + total + "원");*/
    }
}
