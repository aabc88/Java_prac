package ch3.section5_inherited.test7;

//override test
class Student {
    String name;
    int score;

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
}

class University extends Student {
    String major;

    @Override
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("score: " + score);
        System.out.println("major: " + major);
    }

    void method(int a) {
    }

    public void method() {

    }

}

public class Exam7 {
    public static void main(String[] args) {
        University obj1 = new University();
        obj1.printInfo();
    }
}
