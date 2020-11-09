package loop;

public class Forloop {

    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i==13){
                break;
            }
            if(i % 2 == 0) {
                System.out.println(i + " เลขคู่");
            }else{
                System.out.println(i + " เลขคี่");
            }
        }
    }

}
