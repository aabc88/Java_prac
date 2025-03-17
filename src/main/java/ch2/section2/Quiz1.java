package ch2.section2;

public class Quiz1 {
    public static void main(String[] args) {
        int month = 10;

        if (month >= 3 && month <= 5) {
            System.out.println("봄입니다.");
        } else if (month >= 6 && month <= 8) {
            System.out.println("여름입니다.");
        } else if (month >= 9 && month <= 11) {
            System.out.println("가을입니다.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울입니다.");
        }
    }
}
