package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class JavaDatetime {
    public static void main(String[] args) throws ParseException {
        // หาวันปัจจุบันของเครื่อง
        Date date = new Date();
        System.out.println(date.toString());

        // การจัดรูปแบบวันที่ต้องการแสดงผล
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // เซ็ต timezone
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String currentDate = sdf.format(date);

        System.out.println(currentDate);
        System.out.println(LocalDateTime.parse("2020-11-11T10:29:00").atZone(ZoneId.of("Asia/Bangkok")));
    }
}
