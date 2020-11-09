package input;

import java.io.*;

public class JavaReader {
    public static void main(String[] args) throws IOException {
        // การรับค่าจากผู้ใช้ในภาษา Java
        System.out.print("กรุณาป้อนชื่อ: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String result = buffer.readLine();

        System.out.print("กรุณาป้อนอายุ: ");
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buffer1 = new BufferedReader(in1);
        String result1 = buffer1.readLine();

        System.out.println("สวัสดีคุณ " + result + " คุณอายุ "+result1);
    }
}
