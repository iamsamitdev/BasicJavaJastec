package loop;

public class WhileLoop {
    public static void main(String[] args) {
        int round = 1;
        int data = 10;

        while(round <= 10){
//            System.out.println(data+round);
            System.out.println("โปรแกรมนับเลข");
            System.out.println(round);
            round++;
        }

        do {
            System.out.println(data+round); // 11
            System.out.println(round + "โปรแกรมนับเลข");
            round++;
        }while(round <= 10);

    }
}
