package ch2.section2;

public class Exam8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("-----" + dan + "단----");
            for (int dan2 = 2; dan2 <= 9; dan2++) {
                System.out.println(dan + " * " + dan2 + " = " + dan * dan2);
            }
        }
    }
}
