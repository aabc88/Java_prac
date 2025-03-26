package ch4.section2.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        int week = calendar.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case Calendar.SUNDAY:
                System.out.println("Sunday");
                break;
            case Calendar.MONDAY:
                System.out.println("Monday");
                break;
            case Calendar.TUESDAY:
                System.out.println("Tuesday");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thursday");
                break;
            case Calendar.FRIDAY:
                System.out.println("Friday");
                break;
            case Calendar.SATURDAY:
                System.out.println("Saturday");
                break;
            default:
                break;
        }

        calendar.set(2020, 3, 19);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일");
        System.out.println(sdf.format(calendar.getTime()));

        try{
            SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
            Date d2 = f2.parse("2023-03-19");
            if (date.after(d2)) {
                System.out.println("지난 날짜는 지정 불가");
            } else {
                System.out.println("예약 한 날짜는 "+f2.format(d2));
            }
        } catch (Exception e) {}
    }
}
