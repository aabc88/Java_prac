package ch1.section3;

//main 함수 테스트
public class Exam3 {
    //JVM에 의해 실행 될 클래스는 main 함수를 가지고 있어야함
    public static void main(String[] args) {
        for(String arg: args) {
            System.out.println(arg);
        }
    }
}
//class 파일이 위치하는 디렉토리에서 명령어 입력
//java ch1.section3.Exam3

