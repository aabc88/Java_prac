package ch3.section8_exception;

public class Exam1 {
    void method1(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("end... " + result);
    }

    void method2(int num1, int num2) {
        int result;

        try {
            System.out.println("start...");
            result = num1 / num2;
            System.out.println("end... " + result);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("method2 end");
    }

    void method3(int num, String name) {
        System.out.println("method3 " + num + " " + name);
        try {
            int result = 10 / num;
            name.substring(3);
            System.out.println(result + " " + name);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
            e.printStackTrace();
        } catch (Exception e) {
            //모든 예외의 최상위 타입 = Exception
            //여기서 위에  걸리지 않는 모든 예외를 처리
            System.out.println("exception");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exam1 exam1 = new Exam1();

        exam1.method1(5, 5);
        exam1.method1(10, 5);
        //
        exam1.method2(10, 5);
        //exam1.method2(10, 0);
        //
        exam1.method3(3, "hello world");
        exam1.method3(3, null);
    }
}
