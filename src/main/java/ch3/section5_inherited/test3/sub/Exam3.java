package ch3.section5_inherited.test3.sub;


//Exam3와 동일 패키지의 클래스

import ch3.section5_inherited.test3.One;

public class Exam3 extends Super {

    public static void main(String[] args) {
        //동일 패키지의 클래스 이용
        One one = new One();
        one.publicData++;
        //one.protectedData++;
        //one.defaultData++;
        //one.privateData++; //error

        //다른 패키지
        Two two = new Two();
        two.publicData++;
        //two.privateData++; //error
        //two.protectedData++; //error
        //two.defaultData++; //error

        Exam3 obj = new Exam3();
        obj.publicData++;
        obj.protectedData++; //패키지가 다르지만 상속관계의 하위라면 이용가능
    }
}

//접근제한자는 모든 곳에 모든 제한자가 추가되지는 않는다
class A {
} //ok
//public class A2{} //public클래스는 파일명과 같아야함 한 파일당 한개
//private class A2{} //error
//protected class A3{} //error

class B {
    // 변수 함수에는 모든 접근제한자
    //static 으로 선언된 멤버도 모든 접근제한자
    B() {}
    public B(int a){}
    protected B(String a){}
    private B(Double a){}
    void method() {
        //접근제한자와 로컬 변수는 관련없다.
        //로컬 변수는 그 함수 내에서만 그 함수가 실해되는 도중에 이용
        int a = 0;//만 가능
    }
}
