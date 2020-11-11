package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatConvert {
    public static void main(String[] args) throws ParseException {
        // ยกตัวอย่างมีเวลาที่เก็บไว้ในฐานข้อมูลเป็น format ดังนี้
        String dateString = "2020-11-11 10:30:00";

        // Convert string to date
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = format.parse(dateString);

        // Change to new format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String result = sdf.format(date);

        System.out.println(result);

        // แปลงเป็นปี พ.ศ.
        ThaiBuddhistDate tbd = ThaiBuddhistDate.now(ZoneId.systemDefault());
        System.out.println(tbd.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}
