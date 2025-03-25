package ch4.section1_lang;

class User {

}

class Student extends User {
    String name;
    int age;

    //이 클래스는 Object의 서브 클래스이다
    //Object 내에 toString() 함수가 있다
    //Object의 toString()의 해시값 출력이다.
    //데이터가 중심이 클래스를 만들떄(함수가 중심인 곳에서는 잘 안하고)
    //Object의 toString()을 그대로 이용할 수도 있지만
    //자신이 override해서 자신의 데이터가 출력되게 재정의한다.
    //어떤 객체의 데이터가 어떻게 들어가있지? 를 확인하고 싶은 경우
    //sout을 하기 번거로움
    @Override
    public String toString() {
        return super.toString();
    }
}

public class Exam1 {
    public static void main(String[] args) {
        //getClass() : 실제 생성 된 객체의 클래스명이 문자열로
        String str ="hello";
        System.out.println(str.getClass());
        User user = new User();
        System.out.println(user.getClass());
        User user2 = new Student();
        System.out.println(user2.getClass());

        //object - equals() test
        User user3 = new User();
        User user4 = user;
        System.out.println(user.equals(user3));
        System.out.println(user.equals(user4));

        //Object - toString()
        System.out.println(user.toString());
    }
}
