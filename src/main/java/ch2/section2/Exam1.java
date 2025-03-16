package ch2.section2;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println("10 % 4 = " + (10 % 4));
        //수학에선 결과가 실수가 되지만 연산 대상들이 정수여서 결과도 정수로 소수점 버림
        System.out.println("10 / 4 = " + (10 / 4));
        //나누기 연산에 의한 소수점까지 결과로 필요하다면 double 타입으로 만들고 연산
        System.out.println("10 / 4 = " + (double)(10 / 4));

        int data1 = 10;
        int result = data1 + 10;
    }
}
