package ch3.section5_inherited;

class Student {
    String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    int score;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

}

class HighStudent extends Student {
    int classNumber;

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

}

class University extends HighStudent {
    String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

public class Exam1 {
    public static void main(String[] args) {
        University obj1 = new University();
        obj1.name = "홍길동";
        obj1.setScore(90);
        obj1.major = "컴퓨터공학";

        HighStudent obj2 = new HighStudent();
        obj2.name = "홍길서";
        obj2.setScore(80);
        obj2.classNumber = 2;

    }
}
