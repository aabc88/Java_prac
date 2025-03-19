package ch3.section2_method;

public class Exam1 {

    void method1() {
        System.out.println("method1 call");
    }

    void method2(int arg1, String arg2, boolean arg3, int arg4) {
        System.out.println("method2 " + arg1 + " " + arg2 + " " + arg3 + " " + arg4);
    }

    String method3(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return String.valueOf(sum) ;
    }

    void method4() {
        System.out.println("method4 call");

        System.out.println("method4 end");
    }

    void method5() {
        System.out.println("method5 call");
        method4();
        System.out.println("method5 end");
    }

    void method6() {
        System.out.println("method6 call");
        method5();
        System.out.println("method6 end");
    }

    public static void main(String[] args) {
        Exam1 obj = new Exam1();
        obj.method1();
        obj.method2(1, "abc", true, 2);
        System.out.println(obj.method3(300));

        obj.method6();
    }
}
