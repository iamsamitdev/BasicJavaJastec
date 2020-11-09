package condition;

public class Ifelsecondition {
    public static void main(String[] args) {
        int num = 8;

        if(num >= 10){
            System.out.println("Large size");
        }else if(num == 5 || num == 8) {
            System.out.println("Medium size");
        }else{
            System.out.println("Small size");
        }

    }
}
