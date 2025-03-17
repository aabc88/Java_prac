package ch2.section2;

public class Exam4 {

    public static void main(String[] args) {
        //if
        int javaScore = 70;

        if (javaScore >= 60) {
            if (javaScore >= 80) {
                System.out.println("고득점입니다.");
            }
            System.out.println("합격입니다.");
        }

        //if - esle : false 일 때 실행 시켜야 하는 로직이 있을 때
        javaScore = 20;
        if (javaScore >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

        //if -else if : 하나의 상황에 조건을 여러개
        javaScore = 89;

        if (javaScore >= 90)    {
            System.out.println("A");
        } else if (javaScore >= 80)    {
            System.out.println("B");
        } else if (javaScore >= 70)    {
            System.out.println("C");
        }   else if (javaScore >= 60)    {
            System.out.println("D");
        }   else {
            System.out.println("F");
        }
    }
}
