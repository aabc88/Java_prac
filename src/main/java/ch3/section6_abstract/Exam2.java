package ch3.section6_abstract;

interface ITest1 {
    //자동으로 public static final 키워드가 추가됨
    int COUNT = 1;
    //아래처럼 선언한 것과 동일하다.
    public static final int MAX_SIZE = 10; //자동으로 추가 되기에 회색으로 표시됨

    //접근제한자는 public으로 고정 된다.
    //private int a = 0; //error
    //protected int b = 10; //error

    void method1();

    //위의 함수는 아래처럼 선언된 것과 동일
    //public abstract 자동추가
    public abstract void method2();

    //구현체를 가지는 함수를 추가하고 싶다면 default, static, private중 한개 추가
    default void method3() {
        System.out.println("method3");
        method1();
        method5();
    }

    //클래스의 static처럼 이름, 함수명
    static void method4() {

    }

    private void method5() {
    }
}

interface ITest2 {
    void iTest2();
}

interface ITest3 {
    void iTest3();
}

//인터페이스를 선언하면서 다른 인터페이스를 상속받아 선언 가능함
//인터페이스는 다중 상속이 가능함
interface ITest4 extends ITest3, ITest2 {
    void iTest4();
}

abstract class AbstractClass {
    abstract void some1();
}

//클래스를 선언하면서 여러개의 인터페이스 구현 가능
class Sub2 extends AbstractClass implements ITest1, ITest4 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    //interface에 선언된 default로 선언된 함수를 구현 클래스 내에서 오버라이드로 재선언 가능
    @Override
    public void method3() {
        ITest1.super.method3();
    }

    @Override
    public void iTest4() {

    }

    @Override
    public void iTest2() {

    }

    @Override
    public void iTest3() {

    }

    @Override
    void some1() {

    }
}

public class Exam2 {
    Sub2 obj1 = new Sub2();
    AbstractClass obj2 = new Sub2();

}
