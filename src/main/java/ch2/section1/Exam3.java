package ch2.section1;

public class Exam3 {
    public static void main(String[] args) {
        boolean isPressed = true;
        //char 데이터는 문자 하나
        char grade = 'A';
        byte byte1 = 127;

        //자바 정수의 기본 타입은 int타입
        short short1 = 17;
        int int1 = 120;
        long long1 = 10L; //long타입의 데이터라는 것을 명시적으로 표현하기 위해 L추가

        //자바에서 실수의 기본 타입은 double
        float float1 = 10.20f; //f로 float타입의 데이터임을 명시함.
        double double1 = 10.0;

        //어떤 언어에서도 문자열을 표현하기 위한 기초 타입을 제공하진 못한다.
        //문자열은 문자의 배열 표현이 기본이다.
        //개발자가 코드에서 문자열을 char배열로 핸들링하는건 너무 수고가 많음
        //이 문자열 처리를 마치 단일 데이터인 것 처럼 도와주기 위한 클래스를 제공한다.
        //문자열은 그 클래스 타입의 객체로 표현한다.
        //String 클래스, 자바에서 기본제공하는 라이브러리
        String str = "hello world";

    }
}
