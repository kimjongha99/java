package chap1;


import java.util.*;

import chap1.Week;
public class EnumWeekExample {
    public static void main(String[] args) {
        Week today= null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){

            case 1:
                today= Week.SUNDAY; break;
            case 2:
                today= Week.MONDAY; break;
            case 3:
                today= Week.TUESDAY; break;
            case 4:
                today= Week.THURSDAY; break;
            case 5:
                today= Week.FRIDAY; break;

            case 6:
                today= Week.SATURDAY; break;

        }
        System.out.println("오늘 요일" + today);


    }
}

