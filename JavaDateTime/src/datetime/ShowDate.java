package datetime;
import java.text.ParseException;

public class ShowDate {
    public static void main(String[] args) throws ParseException {
        String myDate = "1982-08-15 07:30:00";
        String myFormat = "yyyy-MM-dd hh:mm:ss";
        System.out.println(DateConvertFunction.DateConvert(
                myFormat,
                "dd-MM-yyyy",
                myDate)
        );
        System.out.println(DateConvertFunction.DateConvert(
                myFormat,
                "hh.mm.ss",
                myDate)
        );
    }
}
