package ch2.section2;

public class Exam3 {
    public static void main(String[] args) {
        int a = 3; // 0000 0011
        int b = 5; // 0000 0101

        System.out.println("(a & b) : " + (a & b));
        System.out.println("(a | b) : " + (a | b));
        System.out.println("(a ^ b) : " + (a ^ b));
        System.out.println("(a >> 1) : " + (a >> 1));
        System.out.println("(a << 1) : " + (a << 1));

        int javaScore = 83;
        System.out.println(javaScore >= 60 ? "합격" : "불합격");
    }
}
