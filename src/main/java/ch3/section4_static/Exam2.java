package ch3.section4_static;

//static과 this
public class Exam2 {
    int objVar = 0;
    static int staticVar = 0;

    void objMethod() {
        objVar++;
        staticVar++;
        staticMethod();
    }

    static void staticMethod() {
        //static함수에서 object멤버이용 불가능
        //아용하려면 이곳에서 객체 생성해서 메모리 할당해야함.
        //objVar++; //error
        staticVar++;
        //objMethod();//error
    }

    public static void main(String[] args) {
        Exam2 exam = new Exam2();
        exam.objMethod();
        staticMethod();
    }
}
