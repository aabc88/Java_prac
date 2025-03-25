package ch4.section1_lang;

public class Exam3 {
    public static void main(String[] args) {
        //기초 타입의 데이터가 객체로 이용해야 하는 경우
        Object[] objArray = {
                new Integer(1),
                new Boolean(true),
                new Double(3.14),
        };

        //원래는 위 처럼 사용해야 하지만
        //편의서응ㄹ 위해 값을 직접 준 것처럼 사용 가능
        //내부적으로는 객체가 만들어짐
        Object[] objArray2 = {
                1, true, 3.14
        };

        int score1 = 60;
        Integer wrapper1 = new Integer(score1);
        Integer wrapper2 = Integer.valueOf(score1);

        int a1 = wrapper1.intValue();

        Integer b1 = score1;
        int c1 = b1;
    }
}
