package ch3.section5_inherited.test8_final;

//final test (한번 선언하면 변경할 수 없음)
//final class는 상속불가
class Super {
    //변수 앞에 선언
    final int A = 0; //대문자로 하는게 보통이며 더 이상 수정 불가능(val)
    final int B;

    Super(int a, int b) {
        //this.A = a; //error 이미 값이 있기에 변경 불가능
        //final로 변수 선언과 동시에 값을 주지 않았을 경우 생성자에서 초기값을 줄수있음.
        this.B = b;
    }
    //final생성자는 불가능
    //final Super() {}

    //final함수는 override못함
    final void method() {

    }
}

class Sub extends Super {

    Sub(int a, int b) {
        super(a, b);
    }

    /*@Override
    void method() {
        super.method();
    }*/
}

public class Exam8 {
}
