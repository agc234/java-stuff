public class IncomeRates {
    public static void main(String[] args) {
        switch (args[0]) {
            case "arith":
                double result = arithmetic(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                System.out.println("The arithmetic present value is" + result);
                break;
            case "geo":
                result = geometric(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
                System.out.println("The geometric present value is" + result);
                break;
        }      
    }

    public static double arithmetic(double G, double i, double n) {
        double p = 0;
        double power = Math.pow(1+i, n);
        double frac1 = (power - 1)/i*power;
        double frac2 = n/power;
        double coeff = (1/i)*(frac1 - frac2);
        p = G * coeff;
        return p;
    }

    public static double geometric(double P, double roi, double i, int y1, int y2) {
        double fP = StudentLoan.fP(P, roi, y1*12);
        double pF = 1/(StudentLoan.fP(P, i, y2*12));
        double adP = P*(1-pF*fP)/(i - roi);
        return adP;
    }
}