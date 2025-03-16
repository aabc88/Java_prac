package ch1.section3;

//한 자바 파일에 여러 클래스 선언 가능하다.
/*
class Some1{}
class Some2{}
*/

//public으로 클래스가 선언될 수 있지만 public으로 선언된 클래스는 파일명과 대소문자가 동일해야함.
/*
class Some1{}
public class Some2{} //Error
*/

//하나의 자바 파일에 여러개의 클래스가 선언될 수 있지만 public으로 선언하는 클래스는 한개만 가능함.
/*
public class Exam1 {}
public class Some2 {} //Error
*/


public class Exam1 {
}

class Some2 {
}
