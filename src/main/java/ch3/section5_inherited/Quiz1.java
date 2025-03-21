package ch3.section5_inherited;

class Super {
    {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    Super() {
        System.out.println("3");
    }
    int a;

}

class Sub extends Super {
    {
        System.out.println("4");
    }
    static {
        System.out.println("5");
    }
    Sub() {
        System.out.println("6");
    }
    Sub(int a) {
        this();
        System.out.println("7");
    }
    int b;
}
public class Quiz1 {
    public static void main(String[] args) {
        Sub sub1 = new Sub();
        Sub sub2 = new Sub(5);
        //2 5 1 3 4 6 1 3 4 6 7
    }
}
