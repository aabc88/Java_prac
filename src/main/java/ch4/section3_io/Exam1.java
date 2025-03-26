package ch4.section3_io;

import java.io.*;

public class Exam1 {
    public static void main(String[] args) {
        try {
            //file을 byte로 읽는 역할
            FileInputStream fis = new FileInputStream("/Users/hej/Desktop/test.txt");
            //byte를 문자열로 변형시켜주는 stream을 연결
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            File dir = new File("/Users/hej/Desktop/");
            dir.mkdir();
            File file = new File(dir, "test.txt");
            file.createNewFile();

            if (dir.isDirectory()) {
                System.out.println(dir.getName() + "은 디렉토리입니다.");
            }
            if (file.isFile()) {
                System.out.println(file.getName() + "은 파일입니다.");
            }
            if (file.exists()) {
                PrintWriter pw = new PrintWriter(file);
                pw.println(sb.toString());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.length());
            }

            File cDri = new File("/Users/hej/Desktop/");
            String[] fileNames = cDri.list();
            for(String name: fileNames) {
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
