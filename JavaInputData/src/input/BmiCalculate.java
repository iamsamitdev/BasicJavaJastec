package input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BmiCalculate {
    public static void main(String[] args) throws IOException {

        double bmi;
        String bmi_status;

        System.out.println("-----------------------");
        System.out.println("โปรแกรมคำนวณหาค่า BMI");
        System.out.println("-----------------------");

        System.out.print("ป้อนน้ำหนัก (kg): ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String weight = buffer.readLine(); // จะได้เป็น String
        double weight_data = Double.parseDouble(weight); // แปลง String เป็นทศนิยม

        System.out.print("ป้อนส่วนสูง (cm): ");
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buffer1 = new BufferedReader(in1);
        String height = buffer1.readLine(); // จะได้เป็น String
        double height_data = Double.parseDouble(height); // แปลง String เป็นทศนิยม

        // คำนวณหา bmi
        bmi = weight_data / Math.pow(height_data / 100 ,2);

        // เขียนเงื่อนไขตรวจค่า bmi
        if(bmi < 18){
            bmi_status = "คุณผอมไป";
        }else if(bmi >= 18 && bmi <= 25){
            bmi_status = "คุณปกติ";
        }else{
            bmi_status = "คุณอ้วนไป";
        }

        System.out.println("ค่า bmi ของคุณ: "+ String.format("%.2f", bmi)+ " "+ bmi_status);
    }
}
