package ai0623;

import java.util.Scanner;

public class Finaltest {
    static class Checklist {
        private String purpose;

        public Checklist(String purpose) {
            this.purpose = purpose;
        }

        public String getPurpose() {
            return purpose;
        }

        public void printCommonItems() {
            System.out.println("[공통 준비물]");
            System.out.println("- 휴대폰");
            System.out.println("- 에어팟");
            System.out.println("- 워치");
            System.out.println("- 지갑");
        }

        public void printBasicItems() {
            System.out.println("[기본]");
            System.out.println("- 상황에 맞는 준비물을 체크하세요.");
        }

        public void printTip() {
            System.out.println("[외출 전]");
            System.out.println("- 외출 전에 준비물을 한 번 더 확인하세요.");
        }
    }

    static class SchoolChecklist extends Checklist {

        public SchoolChecklist() {
            super("학교");
        }

        @Override
        public void printBasicItems() {
            System.out.println("[학교 기본 준비물]");
            System.out.println("- 텀블러");
            System.out.println("- 맥북 또는 패드");
            System.out.println("- 충전기");
            System.out.println("- 필통");
            System.out.println("- 안경");
            System.out.println("- 이클립스");
        }

        @Override
        public void printTip() {
            System.out.println("[학교 외출 전]");
            System.out.println("- 버스 시간 미리 확인하세요.");
        }
    }

    static class WorkChecklist extends Checklist {

        public WorkChecklist() {
            super("알바");
        }

        @Override
        public void printBasicItems() {
            System.out.println("[알바 준비물]");
            System.out.println("- 유니폼");
            System.out.println("- 교통카드");
            System.out.println("- 물");
        }

        @Override
        public void printTip() {
            System.out.println("[알바 외출 전]");
            System.out.println("- 출근 시간을 미리 확인하세요.");
        }
    }

    static class TravelChecklist extends Checklist {

        public TravelChecklist() {
            super("여행");
        }

        @Override
        public void printBasicItems() {
            System.out.println("[여행 기본 준비물]");
            System.out.println("- 여권 또는 신분증");
            System.out.println("- 보조배터리");
            System.out.println("- 충전기");
            System.out.println("- 세면도구");
            System.out.println("- 여벌 옷");
            System.out.println("- 화장품");
            System.out.println("- 비상약");
            System.out.println("- 예약 정보 확인");
        }

        @Override
        public void printTip() {
            System.out.println("[여행 외출 팁]");
            System.out.println("- 숙소, 교통편, 예약 정보를 출발 전에 다시 확인하세요.");
        }
    }

    static class ExerciseChecklist extends Checklist {

        public ExerciseChecklist() {
            super("운동");
        }

        @Override
        public void printBasicItems() {
            System.out.println("[운동 기본 준비물]");
            System.out.println("- 운동복");
            System.out.println("- 물");
            System.out.println("- 수건");
        }

        @Override
        public void printTip() {
            System.out.println("[운동 외출 전]");
            System.out.println("- 헬스장 운영 시간 체크하세요.");
        }
    }

    static class ChecklistManager {

        public String getWeatherName(int weather) {
            if (weather == 1) {
                return "맑음";
            } else if (weather == 2) {
                return "비";
            } else if (weather == 3) {
                return "추움";
            } else if (weather == 4) {
                return "더움";
            } else {
                return "알 수 없음";
            }
        }

        public void printWeatherItems(int weather) {
            System.out.println();

            if (weather == 1) {
                System.out.println("[날씨 추가 준비물]");
                System.out.println("- 선크림");
                System.out.println("- 손선풍기");
                System.out.println("- 선글라스");

                System.out.println();
                System.out.println("[날씨 주의사항]");
                System.out.println("- 햇빛이 강할 수 있으니 선크림을 바르세요.");

            } else if (weather == 2) {
                System.out.println("[날씨 추가 준비물]");
                System.out.println("- 우산");
                System.out.println("- 여분 양말");
                System.out.println("- 손수건");
                System.out.println("- 방수 가능한 가방");

                System.out.println();
                System.out.println("[날씨 주의사항]");
                System.out.println("- 전자기기가 젖지 않도록 가방 안쪽에 보관하세요.");

            } else if (weather == 3) {
                System.out.println("[날씨 추가 준비물]");
                System.out.println("- 겉옷");
                System.out.println("- 핫팩");

                System.out.println();
                System.out.println("[날씨 주의사항]");
                System.out.println("- 실내외 온도 차이가 클 수 있으니 겉옷을 챙기세요.");

            } else if (weather == 4) {
                System.out.println("[날씨 추가 준비물]");
                System.out.println("- 시원한 물");
                System.out.println("- 양산");
                System.out.println("- 손선풍기");

                System.out.println();
                System.out.println("[날씨 주의사항]");
                System.out.println("- 물을 자주 마시고 오래 걷지 않도록 주의하세요.");

            } else {
                System.out.println("[날씨 추가 준비물]");
                System.out.println("- 선택한 날씨 정보가 없어 기본 준비물만 추천합니다.");
            }
        }

        public void printResult(Checklist checklist, int weather) {
            System.out.println();
            System.out.println("====================================");
            System.out.println("        추천 체크리스트 결과");
            System.out.println("====================================");
            System.out.println("외출 목적: " + checklist.getPurpose());
            System.out.println("오늘 날씨: " + getWeatherName(weather));
            System.out.println();

            checklist.printCommonItems();
            System.out.println();

            checklist.printBasicItems();
            printWeatherItems(weather);

            System.out.println();
            checklist.printTip();

            System.out.println();
            System.out.println("====================================");
            System.out.println("     외출 준비 체크 완료!");
            System.out.println("====================================");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Checklist checklist = null;
        ChecklistManager manager = new ChecklistManager();

        System.out.println("====================================");
        System.out.println("  외출 준비 체크리스트 추천 프로그램");
        System.out.println("====================================");

        System.out.println();
        System.out.println("외출 목적을 선택하세요.");
        System.out.println("1. 학교");
        System.out.println("2. 알바");
        System.out.println("3. 여행");
        System.out.println("4. 운동");
        System.out.print("선택: ");
        int purpose = s.nextInt();

        if (purpose == 1) {
            checklist = new SchoolChecklist();
        } else if (purpose == 2) {
            checklist = new WorkChecklist();
        } else if (purpose == 3) {
            checklist = new TravelChecklist();
        } else if (purpose == 4) {
            checklist = new ExerciseChecklist();
        } else {
            System.out.println("잘못된 선택입니다. 기본 체크리스트로 진행합니다.");
            checklist = new Checklist("기본 외출");
        }

        System.out.println();
        System.out.println("오늘 날씨를 선택하세요.");
        System.out.println("1. 맑음");
        System.out.println("2. 비");
        System.out.println("3. 추움");
        System.out.println("4. 더움");
        System.out.print("선택: ");
        int weather = s.nextInt();

        manager.printResult(checklist, weather);

        s.close();
    }
}
