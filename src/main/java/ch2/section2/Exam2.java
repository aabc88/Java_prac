package ch2.section2;

public class Exam2 {
    public static void main(String[] args) {
        int e1 = 10;
        int f1 = 10;

        if (--e1 > 10 & --f1 > 10 ){
            System.out.println("if 1 - true");
        }

        int e2 = 10;
        int f2 = 10;
        if (--e2 > 10 && --f2 > 10) {
            System.out.println("if 2 - true");
        }

        System.out.println("e1 = " + e1 + "; f1 = " + f1 + "; e2 = " + e2 + "; f2 = " + f2);
    }
}
