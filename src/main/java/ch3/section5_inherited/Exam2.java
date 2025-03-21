package ch3.section5_inherited;

//클래스를 선언하면서 명시적으로 extends에 의해 상위클래스를 지정하지 않으면
//자동으로 Object클래스를 상속받게 되어있음
//Super1은 Object의 하위 클래스가 된다.
//Object는 자바 모든 클래스의 최상위
//자바의 모든 클래스는 Object 하위
class Super1 {

}

class Sub1 extends Super1 {

}

class Super2 {
    Super2(int a){

    }
}

class Sub2 extends Super2 {
        //생성자를 명시적으로 선언하지 않으면 컴파일러가 default생성자 추가
    //모든 하위 생성자는 그 생성자로 객체가 생성될 때 무조건 상위 생성자가 호출되어야함
    //그래서 실제 컴파일러에 의해 추가된 생성자를 유추하면
    Sub2() {
        super(10);
    }
}

class Super3{
    Super3(int a){}
    Super3(String a, int b) {

    }
}

class Sub3 extends Super3 {

    Sub3(int a) {
        super("s", a);
        //super()로 상위 생성자 호출 구문은 생성자 내에서 가장 첫줄, 한번만
        //super("hello", a); //error
    }

    Sub3(String a, int b) {
        //이곳에 명시적으로 개발자가 super()를 추가하지 않으면
        //컴파일러가 가장 첫줄에 super() 를 추가해준다.
        //자신의 다른 생성자를 호출하고 싶다면 호출가능하다
        this(b);
        //super(b);
        //어떻게 생성자를 연결하든 객체 생성 시점에 상위 생성자가 호출되게 해야함

    }
}

public class Exam2 {

}
