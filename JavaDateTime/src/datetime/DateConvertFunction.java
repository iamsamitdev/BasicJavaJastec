package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertFunction {
   public static String DateConvert(String DefaultFormat, String OutputFormat, String InputData) throws ParseException {
       String dateString = InputData;
       // Convert string to date
       SimpleDateFormat format = new SimpleDateFormat(DefaultFormat);
       Date date = format.parse(dateString);

       // Change to new format
       SimpleDateFormat sdf = new SimpleDateFormat(OutputFormat);
       String result = sdf.format(date);

       return result;
   }
}
