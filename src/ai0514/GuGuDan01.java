package ai0514;

import java.sql.SQLOutput;

public class GuGuDan01 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d*%d=%d\t", dan, i, dan*i);
            }

            System.out.println();
        }
    }
}
