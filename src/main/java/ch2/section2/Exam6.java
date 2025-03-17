package ch2.section2;

public class Exam6 {
    public static void main(String[] args) {
        //1~10 더하기
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //1~10  짝수만 더하기
        sum = 0;
        i = 0;

        while (i <= 10) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);


        i = 1;
        int dan = 2;
        while (dan <= 9) {
            System.out.println("--------"+dan+"단--------");
            while (i<= 9) {
                System.out.println(dan+" * "+i+" = "+dan*i);
                i++;
            }
            i = 1;
            dan++;
        }
    }
}
