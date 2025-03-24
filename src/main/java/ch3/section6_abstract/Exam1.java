package ch3.section6_abstract;

class Super1 {

}

abstract class Super2 {
    //클래스가 추상형으로 선언되었고, 추상 함수가 ㅇ벗다
    //이런 클래스는 의미없음

}

class Super3 {
    //추상 함수가 선언되어 있다면 클래스 또한 추상형으로 선언 되어야 함
    //abstract void method(); //error
}

abstract class Super4 {
    //abstract void method(){}; //error 추상형은 바디를 가질 수 없음
    abstract void method1();

    //추상형이어도 정상함수 작성 가능.
    void method2() {
    }
}

class Sub1 extends Super4 {
    //상위의 추상함수를 모두 다 오버라이드
    //함수 재정의 임으로 자신에게추상함수가 상속되지 않음
    //나는 추상함수를 가지지 않고 객체 생성해서 이용 가능해진다.
    @Override
    void method1() {
        System.out.println("Sub1 method1");
    }
}

abstract class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    abstract void examTake();

    abstract void examSolve();

    abstract void examSubmit();

    void doExam() {
        //아래의 함수를 호출하려면 이클래스를 작성하는 시점에 함수가 선언되어있어야함
        //각 함수의 행위가 하위 클래스마다 로직이 다르다
        examTake();
        examSolve();
        examSubmit();
    }
}

class HighStudent extends Student {
    HighStudent(String name,int score) {
        super(name, score);
    }
    @Override
    void examTake() {
        System.out.println("High take method");
    }

    @Override
    void examSolve() {
        System.out.println("High solve method");
    }

    @Override
    void examSubmit() {
        System.out.println("High submit method");
    }
}

public class Exam1 {
    public static void main(String[] args) {
        Super1 obj1;
        Super2 obj2;//추상 클래스도 타입으로는 이용가능
        obj1 = new Super1();
        //obj2 = new Super2(); //error 추상클래스는 객체화 불가능

        Student student = new HighStudent("kim",100);
        student.examTake();
    }
}
