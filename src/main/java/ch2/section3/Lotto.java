package ch2.section3;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = {43,12,39,3,24,8};
        int temp;

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length; j++) {
                if(i != j) {
                    if (lotto[i] < lotto[j]) {
                        temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }
    }
}
