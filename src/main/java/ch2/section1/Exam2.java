package ch2.section1;


//변수 선언, 초기화
public class Exam2 {
    //변수 선언과 동시에 초기회
    int data1 = 0;
    //동일 타입의 변수를 여러개 선언한다면, 한 줄에 가능
    int data2, data3, data4 = 1;

    boolean data5;
    String data6;

    void sayHello() {
        System.out.println("data2 : " + data2 + ", data3 : " + data3 + ", data4 : " + data4);
        System.out.println("data5 : " + data5 + ", data6 : " + data6);

        //어떤 함수내에 선언된 변수
        //함수가 실행 되어야 메모리가 확보됨
        //함수의 지역변수
        int data7 = 20;
        System.out.println(data7);

        //변수가 이용되는 영역
        //클래스 {} - 클래스 전체에서
        //함수 {} - 함수 내에서
        //for() {} - for문 안에서만
        for (int i = 0; i < 1; i++) {
            int data8 = 0;
        }

    }

    public static void main(String[] args) {
        Exam2 exam2 = new Exam2();
        exam2.sayHello();
    }
}
