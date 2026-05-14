package ai0514;

public class ContinueTest03 {
    public static void main(String[] args) {
        int count = 0;
        int dice1, dice2, dice3;

        while (true) {
            count++;
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            dice3 = (int) (Math.random() * 6 + 1);

            if ((dice1 == dice2) && (dice2 == dice3))
                break;
        }
        System.out.printf("3개 주사위는 모두 %d입니다.\n", dice1);
        System.out.printf("같은 숫자가 나올 때올 때까지 %d번 던졌습니다\n", count);
    }
}
