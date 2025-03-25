package ch4.section1_lang;

public class Exam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        //기초 타입의 == 은 값 비교이고
        //객체 타입의 == 은 객체 비교이다.
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str3 == str4); //false

        //equals는 주소를 비교한다
        //String에서 오버라이드 해서 String의 equals는 값 비교이다.
        //String의 값 비교할 때는 == 사용하면 신경써야함. equals사용해라
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //ture
        System.out.println(str3.equals(str4)); //true

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //String은 불변의 값이기에 값이 바뀔 때 마다 메모리가 재 할당된다.
        str1 += "world";
        System.out.println(str1.hashCode());

        //반면 StringBuffer는 동일 객체의 값이 변경되며
        //문자열이 빈번히 변경 될 경우 이게 용이함
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.hashCode());
        sb = sb.append("world");
        System.out.println(sb.hashCode());

        //String의 함수들
        String str = "Hello World";

        //대소문자 관계없이 같나 ? > equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase("hello world"));

        //문자열 연결 > concat
        System.out.println(str.concat(" aaa"));
        System.out.println(str.replace('o', 'O'));

        //특정 위치의 문자열 추출
        //1 부터 특정 위치까지
        System.out.println(str.substring(1, 5));

        //구분자를 주고 구분자로 문자열 잘라서 배열로 리턴
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        //
        String[] address = {"서울시 강남구 역삼동", "서울시 강남구 청담동", "서울시 송파구 방이동"};
        for (String addr: address) {
            System.out.println(addr.indexOf("강남구"));
        }
    }
}
