package ch4.section4_thread;

class Food extends Thread {
    //독립 스레드에 의해 처리 될 시간이 오래 걸리는 업무를 구현하는곳
    //새로운 스레드에 의해 run이 호출 되고 run이 끝나면 스레드는 자동 종료

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Food"+i);
        }
    }
}

class Phone implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Phone"+i);
        }
    }
}

public class Exam1 {
    //앱이 실행 되면서 처음 발생된 실행흐름을 main Thread라고함

    public static void main(String[] args) {
        Food food = new Food();
        Phone phone = new Phone();
        Thread t1 = new Thread(phone);


        t1.start();
        food.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}
