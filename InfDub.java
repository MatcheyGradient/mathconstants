public class InfDub {
    public static void main(String[] args){
        double calculation;
        double denominator = 2;
        double answer = 1;
        double store;

        for(long ingforb = 0; ingforb < 10L; ingforb++) {
            store = answer;
            calculation = 1/denominator;
            answer = calculation + store;
            denominator *= 2;
        }

        System.out.println(answer - 1);

    }
}
