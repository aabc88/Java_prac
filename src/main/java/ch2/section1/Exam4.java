package ch2.section1;

public class Exam4 {
    public static void main(String[] args) {
        int a = 10;
        double d = a; //int > double 암시적 캐스팅 자동으로
        //double > int는 error

        int a2 = (int)d;
        double d3 = 20.34;
        int a3 = (int)d3; //캐스팅 하면서 소수점이 버려짐

        System.out.println(a3);

        //char도 정수로 표현이 가능 (ascii)
        char c = 'A';
        int a4 = c;
        System.out.println("A : "+ a4);

        //영문자가 아닌 각국 언어의 문자도 정수화 될 수 있지만 큰 수로 나와 의미없음.
        //char로 정수화 시켜서 로직을 잡는 경우는 일반적으로 영문자
        char c2 = '가';
        int a5 = c2;
        System.out.println("A : "+ a5);

        //가장 많이 발생하는 캐스팅은 "10" <-> 10
        //String <-> int

        String str = "10";
        int intData = Integer.parseInt(str);

        String str2 = String.valueOf(20);
        System.out.println((str+10)+", "+(intData+10));

    }
}
