public class Add {
    public static void main(String[] args){
        double n;
        double d = 1;
        double num = 0;
        double store;


        for(long i = 0; i < 5; i++) {
            store = num;
            num = d + store;
            d += 1;
        }
        System.out.println(num);
    }
}
