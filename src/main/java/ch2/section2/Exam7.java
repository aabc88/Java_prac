package ch2.section2;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        //jvm에서 실행 중, 콘솔 창에서 유저가 입력한 데이터 획득
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")) return;
        System.out.println(input);
    }
}
