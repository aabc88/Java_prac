package ch3.section1_oop;

class Student {
    String name;
    int score;

    void printInfo() {
        System.out.println(name + "의 점수 : " + score);
    }
}

public class Exam2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "kim";
        s1.score = 100;


        Student s2 = new Student();
        s2.name = "lee";
        s2.score = 90;

        s1.printInfo();
        s2.printInfo();

        System.out.println(s1 == s2);//false

        Student s3 = s1;
        System.out.println(s1.name + ", " + s3.name);
        s1.name = "park";
        System.out.println(s1.name + ", " + s3.name);
        s3.name = "hong";
        System.out.println(s1.name + ", " + s3.name);

        System.out.println(s1 = s3);
    }
}
