package ch3.section2_method;

//함수 오버로딩 테스트

//이 클래스의 함수를 이용하면 애플리케이션의 로그를 출력시켜준다는 가정
//개발시에 디버깅 목적으로 sout을 사용해 콘솔에 로그를 남기는 것도 중요하지만

class Log {
    void Log(String arg) {
        System.out.println(arg);
    }

    void Log(int arg) {
        System.out.println(arg);
    }

    void LogInt(int arg) {
        System.out.println(arg);
    }

    void LogBoolean(boolean arg) {
        System.out.println(arg);
    }
}

public class Exam4 {
    public static void main(String[] args) {
        Log log = new Log();
        log.Log("Hello World");
        log.LogInt(100);
        log.LogBoolean(true);
        log.Log(123);
    }
}
