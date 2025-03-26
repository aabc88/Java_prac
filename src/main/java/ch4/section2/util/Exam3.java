package ch4.section2.util;

import java.util.*;

public class Exam3 {
    public static void main(String[] args) {

        //클래스의 타입을 표현하면서 <클래스명>으로 지정하는 기법(제네릭)
        ArrayList<String> list = new ArrayList();
        list.add("뉴욕");
        list.add("서울");
        list.add("런던");
        list.add("서울");

        list.add(1, "LA");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println(list.indexOf("서울"));
        System.out.println(list.lastIndexOf("서울"));
        System.out.println(list.contains("LA"));

        HashSet<String> set = new HashSet<>();
        set.add("서울");
        set.add("뉴욕");
        set.add("서울");
        for (String str : set) {
            System.out.println(str);
        }

        //<String, String> : 키 - string, 값 - string
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "서울");
        map.put("two", "뉴욕");

        System.out.println(map.get("one"));
        //모든 키
        System.out.println(map.keySet());
        //모든 값
        System.out.println(map.values());

        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue("서울"));

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //List, Set, Map
        //순차적으로 모두 핸들링하고 싶을때
        //for loop
        //iterator로 핸들링 해도됨 모든 컬렉션에서 지원하는 기능
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
