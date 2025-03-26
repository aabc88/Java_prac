package ch4.section4_thread;

import java.util.ArrayList;
import java.util.List;

//스레드에 의해 호출되는 하수 및 데이터를 가지는 객체
class Pool {
    List<String> products = new ArrayList<>();

    public synchronized void get() throws InterruptedException {
        if ((products.isEmpty())) {
            wait();
        }
        products.remove(0);
        System.out.println("소비 / 재고 = " + products.size());
    }

    public synchronized void add(String value) throws InterruptedException {
        products.add(value);
        System.out.println("생산 / 재고 = " + products.size());
        notifyAll();
    }
}

class ProductGet implements Runnable {
    Pool pool;

    ProductGet(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                pool.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ProductAdd implements Runnable {
    Pool pool;

    ProductAdd(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                pool.add("상품 " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Exam2 {
    public static void main(String[] args) {
        Pool pool = new Pool();
        Thread getThread = new Thread(new ProductGet(pool));
        Thread addThread = new Thread(new ProductAdd(pool));

        getThread.start();
        addThread.start();

    }
}
