package ch3.section7_inner_enum;

class OuterClass {
    int outerData = 10;
    private int outerData2 = 20;

    void fun() {

    }

    static class StaticInnerClass {
        void innerFun()

        {
        }
    }

    //inner로 선언되었지만 컴파일하면 독립 class가나옴
    //이 클래스에서 어떻게 outer의 private member 접근이 되나?
    //컴파일러는 개발자가 작성한 코드만 추가하지 않고
    //private멤버를 inner에 선언한 클래스에서 이용 가능하게
    //public 함수를 만들어주고 그 함수를 이용해 private를 이용하게 해줌
    class InnerClass {
        int innerData = 20;

        void innerFun() {
            innerData++;
            outerData++;
            outerData2++;
        }


    }
}

class Super {
    void superFun() {

    }
}

interface MyInterface {
    void interfaceFun();
}

public class Exam1 {
    static void some(MyInterface myInterface) {
        myInterface.interfaceFun();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerData++;

        OuterClass.StaticInnerClass obj2 = new OuterClass.StaticInnerClass();

        //익명클래스는 선언과 동시에 객체 생성해야함
        Super obj3 = new Super() {
            @Override
            void superFun() {
                super.superFun();
            }
        };

        MyInterface obj4 = new MyInterface() {
            @Override
            public void interfaceFun() {

            }
        };

        some(new MyInterface() {
            @Override
            public void interfaceFun() {

            }
        });
    }
}
