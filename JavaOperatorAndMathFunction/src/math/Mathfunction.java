package math;

public class Mathfunction {
    public static void main(String[] args) {
        // Operator
        int num = 10;
        int price = 20;
        // System.out.println(num++); // 10
        System.out.println(++num); // 11
        System.out.println(num); // 11

//        System.out.println(price+=10);
        System.out.println(price-=10);

        float num1 = 5.653f;

        // Math function
        System.out.println(Math.PI); // ค่า PI
        System.out.println(Math.pow(2,3)); // ค่ายกกำลัง
        System.out.println(Math.sqrt(2)); // ค่า square root
        System.out.println(Math.max(8,12)); // หาค่าสูงสุด
        System.out.println(Math.min(8,12)); // หาค่าต่ำสุด
        System.out.println(Math.round(num1)); // ตัดเศษลง

        // Random
        System.out.println(String.format("%.0f",Math.random()*1000000)); // 0.0-1.0
    }
}
