package ch3.section2_method;

public class Exam3 {
    void method1(int arg1, int arg2) {

    }

    void method2(int... args) {
        System.out.println(args instanceof int[]);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    void method3(String arg1, int... args) {
        System.out.println(arg1);
        System.out.println(args instanceof int[]);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        Exam3 obj = new Exam3();
        obj.method1(10, 20);
        obj.method2();
        obj.method2(1, 2, 3, 4, 5);

        obj.method3("abc", 1,2,3,4,5);
    }
}
