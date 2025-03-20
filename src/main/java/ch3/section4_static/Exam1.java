package ch3.section4_static;

//static test

class Count {
    int count;
    static int totalCount;

    void method1() {

    }

    static void method2() {

    }
}

public class Exam1 {
    public static void main(String[] args) {
        //method1() // error
        //Count.method1(); // error

        //static 멤버는 객체 생성 전에 이용 가능
        //클래스명.멤버명
        Count.method2();

        //메모리 3개 할당
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c1.count++;
        Count.totalCount++;
        c2.count++;
        Count.totalCount++;
        c3.count++;
        Count.totalCount++;

        System.out.println(Count.totalCount + " : " + c1.count);
        System.out.println(Count.totalCount + " : " + c2.count);
        System.out.println(Count.totalCount + " : " + c3.count);

        c1.totalCount++;
        c2.totalCount++;
        c3.totalCount++;
        System.out.println(Count.totalCount + " : " + c1.totalCount);
        System.out.println(Count.totalCount + " : " + c2.totalCount);
        System.out.println(Count.totalCount + " : " + c3.totalCount);
    }
}
