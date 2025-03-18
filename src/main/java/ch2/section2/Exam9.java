package ch2.section2;

public class Exam9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(j > i) break;
                System.out.println("i, j : " + i + ", " + j);
            }
        }

        System.out.println("----------------------------------");

        outer : for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(j > i) break outer;
                System.out.println("i, j : " + i + ", " + j);
            }
        }

    }
}
