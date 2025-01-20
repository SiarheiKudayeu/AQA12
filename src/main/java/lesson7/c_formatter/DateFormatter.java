package main.java.lesson7.c_formatter;

import java.time.LocalDate;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //%t, %T

        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am
        System.out.printf("Current date format in view %tH HOURS\n", date);
        System.out.printf("Current date format in view %tM MINUTES\n", date);
        System.out.printf("Current date format in view %tS SECONDS\n", date);

        System.out.printf("Current date format in view %1$tH:%1$tM:%1$tS\n", date);

        //A - день недели, d - две цифры даты , B - месяц, m - месяц в виде цифры,
        // Y - год, y - две фин цифры года
        System.out.printf("Current date format in view %1$tA %1$td %1$tB\n", date);

        //получить завтрашнее число
        String currentDayValue = String.format("%td", date);
        int currentDayInt = Integer.parseInt(currentDayValue);
        int tomorrowDate = currentDayInt + 1;
        System.out.println("Tomorrow date " + tomorrowDate);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        System.out.println(localDate.plusDays(23).getMonth() + " " + localDate.plusDays(23).getDayOfMonth());
    }
}
