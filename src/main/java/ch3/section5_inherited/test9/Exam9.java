package ch3.section5_inherited.test9;

//oop의 캐스팅은 상 하위 관계에서만 논할 수 있다.
//전혀 관련없는 클래스간의 캐스팅은 불가능
//형제관계 에서도 안되며 부모 자식 관계만 가능
class Super {}
class Sub extends Super {}

public class Exam9 {
    public static void main(String[] args) {
        Super obj1 = new Super();
        Sub obj2 = new Sub();

        //실제 생성되는 객체는 sub, 타입은 super
        //Super에 선언된 멤버만 사용이 가능
        //암시적 캐스팅 하 -> 상
        Super obj3 = new Sub();
        obj3 = obj2;//하 > 상 암시적

        //Sub obj4 = obj3;//error obj3는 Super타입이기 떄문에 명시적으로 해야함
        Sub obj4 = (Sub)obj3;//상 -> 하 명시적
        Sub obj5 = (Sub)obj1;//컴파일은 가능, 런타임 에러 (클래스캐스팅)
    }
}
