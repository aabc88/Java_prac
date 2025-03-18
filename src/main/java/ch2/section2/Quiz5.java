package ch2.section2;

public class Quiz5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                String result;
                if (j*i < 10) result = ' '+String.valueOf(j*i);
                else result = String.valueOf(j*i);
                System.out.print(j+" * "+i+" = "+(result)+"\t");
            }
            System.out.println();
        }
    }
}
