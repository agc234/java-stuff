/**
 * sum
 */
public class Sum {

    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double h = 0;
        for(int i = 1; i <= n; i++) {
            double x = Math.log(0.8) / Math.log(2);
            h += 100 * Math.pow(i, x);
        }
        System.out.println(h);
    }
}