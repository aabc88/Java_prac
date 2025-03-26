package ch4.section2.util;

import java.util.regex.Pattern;

public class Exam2 {
    public static void main(String[] args) {
        String tel = "010-1234-5678";
        String email = "abc@gmail.com";

        //유저에게 받은 데이터는 비 신뢰적이라고 판단 유효성 검증
        //우리가 원하는 패턴의 문자열인지 검사
        //원하는 패턴을 명시한 졍규 표현식 준비
        String telPattern = "01[0-9]-\\d{3,4}-\\d{4}";
        String emailPattern = "\\w+@\\w+\\.\\W+(\\.\\w+)?";

        if (Pattern.matches(telPattern, tel)) {
            System.out.println("정상적인 전화번호 입니다.");
        } else {
            System.out.println("잘못된 전화번호 입니다.");
        }

        if (Pattern.matches(emailPattern, email)) {
            System.out.println("정상적인 이메일 입니다.");
        } else {
            System.out.println("잘못된 이메일 입니다.");
        }
    }
}
