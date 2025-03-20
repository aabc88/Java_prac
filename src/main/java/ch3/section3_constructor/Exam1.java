package ch3.section3_constructor;

class Student {
    String name;
    int score;
    boolean isPassed;
    String major;

    //개발자가 명시적으로 생성자를 추가하지 않으면 컴파일러에 의해 default 생성자가 추가됨.
    //아래처럼 선언된 것과 동일함
    Student() {}

    //학생 객체를 만들 떄 나머지 데이터는 이후에 발생해도
    //이름이 없는 학생은 존재할 수 없다.
    //객체를 생성하면서 필수 데이터를 매개변수로 받아서 생성과 동시에
    //초기화가 되게 한다.

    Student(String name) { this.name = name; }
    //생성자는 여러개일 수 있다.
    //다른 멤버 변수도 필요하다면 생성하면서 초기화 되게 하고싶다.
    /*Student(String name, int score, boolean isPassed, String major) {
        this.name = name;
        this.score = score;
        this.isPassed = isPassed;
        this.major = major;
    }*/

    Student(String name, int score, boolean isPassed, String major) {
        //함수 내에서 멤버 변수와 로컬 변수를 모두 이용가능
        //이름이 동일하다면 로컬 변수가 지칭됨.
        //this.멤버 로 정확하게 멤버변수임을 지정.
        this(name);
        this.score = score;
        this.isPassed = isPassed;
        this.major = major;
    }
}

public class Exam1 {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.name);
    }
}
