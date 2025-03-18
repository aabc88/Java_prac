package ch2.section2;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("소수인지 판단할 숫자 : ");

        int num = stdin.nextInt();
        boolean flag = true;

        if (num > 0) {
            for (int i = 2; i < num; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(i + " ");
                }
                flag = true;
            }
        }
    }
}
