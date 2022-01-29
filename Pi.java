import static java.lang.Math.sqrt;

public class Pi {
    public static void main(String[] args){
        double n;
        double d = 1;
        double pi = 0;
        double store;

        //Lord Brouncker's Formula
        for(long i = 0; i < 10000000; i++) { // iterates it

            //stores previous number to re-add
            store = pi;

            //does the 1/odd-# ^2 in the formula
            n = 1/(d*d);

            //re-adds the number to previous #
            pi = n + store;

            //goes up by 2 to the next odd #
            d += 2;
        }

        //handles the (pi^2)/8 -> removes denominator
        pi *= 8;

        //square roots the pi to remove the square
        System.out.println(sqrt(pi));
    }
}
