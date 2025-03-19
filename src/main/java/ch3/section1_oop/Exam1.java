package ch3.section1_oop;

//클래스 선언 및 객체 생성 테스트
//클래스의 구성은 변수, 함수, 생성자
class Car {
    double KILOMETERS_PER_LITER = 0;
    double kilometerDriven;
    double lightOil;

    //생성자.. 객체 생성 역할
    Car() {
        KILOMETERS_PER_LITER = 30;
        kilometerDriven = 0;
        lightOil = 0;
    }

    Car(double kpl) {
        if (kpl > 0) {
            KILOMETERS_PER_LITER = kpl;
        } else {
            KILOMETERS_PER_LITER = 30;
        }
    }

    //멤버 메서드(함수)
    double getKilometersPerLiter() {
        return KILOMETERS_PER_LITER;
    }

    double getKilometerDriven() {
        return kilometerDriven;
    }

    double getLightOil() {
        return lightOil;
    }

    void addLightOil(double amount) {
        if (amount > 0) this.lightOil += amount;
    }

    void drive(double kilometers) {
        if (kilometers < KILOMETERS_PER_LITER) {
            kilometerDriven += kilometers;
            lightOil -= kilometers / KILOMETERS_PER_LITER;
        } else {
            System.out.println("기름이 부족합니다.");
        }
    }
}

public class Exam1 {
    public static void main(String[] args) {
        //클래스를 기반으로 객체 생성 사용
        //객체 생성 순간에 메모리 할당
        Car car = new Car(20);
        car.addLightOil(40);
        car.drive(100);
    }
}
