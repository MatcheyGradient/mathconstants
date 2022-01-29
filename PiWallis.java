public class PiWallis {
    public static void main(String[] args){
        double n;
        double d = 2;
        double pi = 1;
        double store;

        for(long i = 0; i < 100000000L; i++) {
            store = pi;
            n = 1-(1/(d*d));
            pi = n*store;
            d += 2;
        }
        double finalpi = 2/pi;

        System.out.println(finalpi + " INVERSE: "+ 1/finalpi);

    }
}
