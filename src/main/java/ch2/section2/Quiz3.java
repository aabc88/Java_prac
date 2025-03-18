package ch2.section2;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("소수인지 판단할 숫자 : ");

        int num = stdin.nextInt();
        boolean flag = true;
        if (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? "소수입니다." : "소수가 아닙니다");
    }
}
