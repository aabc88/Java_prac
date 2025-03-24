package ch3.section7_inner_enum;

enum Direction {
    NORTH, EAST, SOUTH, WEST
}

//개발자 임의 데이터를 enum 상수에 추가
enum Direction2 {
    //enum상수는 enum클래스의 서브클래스 객체
    NORTH(100), SOUTH(200), EASY(300), WEST(400); //error

    //개발자임의데이터를 상수에 추가하려면 먼저 enum클래스생성자 정의하고매개변수로 선언
    int price;

    Direction2(int price) {
        this.price = price;
    }
}

//enum상수에 개발자 함수를 추가해서 함수 호출은 되나 ?
enum Direction3 {
    NORTH(1) {
        @Override
        void print() {
            System.out.println("North");
        }
    }, EAST(2) {
        @Override
        void print() {
            System.out.println("East");
        }
    }, SOUTH(30) {
        @Override
        void print() {
            System.out.println("South");
        }
    }, WEST(4) {
        @Override
        void print() {
            System.out.println("West");
        }
    };

    int price;

    Direction3(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract void print();

    void enumFun() {

    }
}


public class Exam2 {
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        System.out.println(direction.name() + ", " + direction.ordinal());

        Direction2 direction2 = Direction2.NORTH;
        System.out.println(direction2.name() + ", " + direction2.price);

        Direction3 direction3 = Direction3.WEST;
        direction3.print();
        direction3.enumFun();
    }
}
