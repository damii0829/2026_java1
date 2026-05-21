package ai0523;

import java.util.Random;
import java.util.Scanner;

public class javaproject {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String answer;
        String lineName = "";
        String[] stations = {};

        while(true) {

            int lineNumber = random.nextInt(5) + 1;

            switch (lineNumber) {
                case 1:
                    lineName = "1호선";
                    stations = new String[]{"인천", "부평", "부천", "용산", "서울역", "동대문", "동묘", "청량리"};
                    break;
                case 2:
                    lineName = "4호선";
                    stations = new String[]{"혜화", "명동", "서울역", "노원", "성신여대입구", "삼각지", "미아사거리", "별내별가람"};
                    break;
                case 3:
                    lineName = "6호선";
                    stations = new String[]{"합정", "망원", "이태원", "안암", "한강진", "석계"};
                    break;
                case 4:
                    lineName = "7호선";
                    stations = new String[]{"건대입구", "어린이대공원", "뚝섬유원지", "논현", "가산디지털단지"};
                    break;
                case 5:
                    lineName = "9호선";
                    stations = new String[]{"여의도", "노량진", "신논현", "송파나루", "고속터미널"};
                    break;
            }

            System.out.println("오늘은 몇 호선에서 놀까?");
            System.out.println();
            System.out.println("🎲 " + lineName);
            System.out.println();

            System.out.print("이 호선으로 갈까? (y/n) : ");
            answer = s.next();

            if (answer.equals("y") || answer.equals("Y")) {
                break;
            } else if (answer.equals("n") || answer.equals("N")) {
                System.out.println();
            } else {
                System.out.println("y 또는 n만 입력해주세요.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println(lineName + " 어디서?");
        System.out.println();

        while (true) {

            int stationNumber = random.nextInt(stations.length);
            System.out.println("🎉 " + stations[stationNumber] + "역");
            System.out.println();

            System.out.print("다시 추천받을까? (y/n) : ");
            answer = s.next();

            if (answer.equals("n") || answer.equals("N")) {
                System.out.println();
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (answer.equals("y") || answer.equals("Y")) {
                System.out.println();
            } else {
                System.out.println("y 또는 n만 입력해주세요.");
                System.out.println();
            }
        }

        s.close();
    }
}
