package loop;

public class Loop100 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if(i % 10 == 0) {
                System.out.print(i + "\n");
            }else{
                System.out.print(String.format("%02d",i) + " ");
            }
            i++;
        }
    }
}
