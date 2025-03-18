package ch2.section3;

import java.util.Arrays;

public class Quiz1 {
    public static void main(String[] args) {
        int[] array = {76, 92, 49, 78, 83};
        int best = 0;
        int worst = 100;
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > best) best = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < worst) worst = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        System.out.println("최고점수 : " + best);
        System.out.println("최저점수 : " + worst);
        System.out.println("점수총합 : "+total);
        System.out.println("점수평균 : "+ Arrays.stream(array).average());

    }
}
