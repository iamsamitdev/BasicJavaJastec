package condition;

import java.io.*;

public class SwitchCaseCondition {
    public static void main(String[] args) throws IOException {

        System.out.print("กรุณาป้อนเดือนที่ต้องการ 1-12: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String month = buffer.readLine();
        int month_data = Integer.parseInt(month);

        switch(month_data){
            case 1:
                System.out.println("Your choose January");
                break;
            case 2:
                System.out.println("Your choose February");
                break;
            case 3:
                System.out.println("Your choose March");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

    }
}
