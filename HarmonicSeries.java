public class HarmonicSeries {
    public static void main(String[] args){
        double n;
        double d = 1;
        double gam = 0;
        double store;

        long l = 10000000L;

        for(long i = 0; i < l; i++) {
            store = gam;
            n = 1/d;
            gam = n + store;
            d += 1;
        }
        System.out.println(gam);
    }
}
