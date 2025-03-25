package ch3.section8_exception;

public class Exam2 {
    void method1() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void method2() throws ArithmeticException {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            //실제 예외가 뜨면 return과 동일한 효과
            throw new ArithmeticException();
        }
    }

    void method3() throws ArithmeticException {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            throw e;//catch의 매개변수가 자신이 발생한 예외상황
            //그걸 그대로 발생함

            //throws에 선언된 exception보다 상위 타입의 exception을 던질 수 없음
            //throw new Exception();//error
        }
    }

    public static void main(String[] args) {
        Exam2 exam2 = new Exam2();
        System.out.println("step1");
        //exam2.method1();
        System.out.println("step2");
        exam2.method2();
    }
}
