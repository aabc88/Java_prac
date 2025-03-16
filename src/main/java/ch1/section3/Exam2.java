package ch1.section3; // 자바 파일이 있는 물리적인 폴더 위치와 동일하게.
//package aaa; // package는 가장 첫줄에 한번만 가능

import ch1.section3.sub.Exam1_2;
//다른 패키지에 선언된 클래스를 이용하겠다면
//import를 사용
//자바 파일 구성 요소 테스트

//변수, 함수, 클래스 선언
//변수, 함수는 top level에 선언될 수 없다.
//int a = 10;
//void sayHello(){}


public class Exam2 {
    Exam1 obj;
    Exam1_2 obj2;

    //top level 구성 요소는 클래스만 허용한다
    //모든 변수, 함수는 클래스 내에만 선언되어야 한다.
    int a = 10;
    void sayHello() {}

}
