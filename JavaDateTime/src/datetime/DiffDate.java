package datetime;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DiffDate {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startDate = "2020-10-15 08:00:00";
        String endDate = "2020-11-11 11:35:00";
        try {
            // การผลต่างของวัน
            // LocalDateTime start = LocalDateTime.of(2020,10,15,8,00,00);
            // LocalDateTime end = LocalDateTime.of(2020,11,11,11,35,00);

            LocalDateTime start = LocalDateTime.parse(startDate, dtf);
            LocalDateTime end = LocalDateTime.parse(endDate, dtf);

            long daydiff = Duration.between(start, end).toHours();
            System.out.println("Hour: " + daydiff);
            System.out.println("Days: " + daydiff / 24);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
