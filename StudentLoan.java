/*
 * StudentLoan
 */
public class StudentLoan {
    // What is owed post graduation
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double apr = Double.parseDouble(args[1]);
        double nm = Double.parseDouble(args[2]); // compounding periods(months) during college
        double np = Double.parseDouble(args[3]); // compounding periods(months) after college
        double crate = crateCalc(apr);
        double f4 = Math.ceil(fP(P, crate, nm) * 100) / 100;
        double A = Math.ceil(aP(f4, crate, np) * 100) / 100;
        System.out.println("The loan after college is worth $" + f4 + ".");
        System.out.println("You need to make monthly payments of $" + A + " for " + np + " months to pay it off.");
    }

    public static double crateCalc(double apr) {
        double m = 1 + apr/12.0;
        double crate = (Math.pow(m, 12) - 1) / 12.0;
        return crate;
    }

    public static double fP(double principal, double crate, double periods) {
        double F = principal * Math.pow(1 + crate, periods);
        return F;
    }

    public static double aP(double principal, double crate, double periods) {
        double apFactor = (crate * Math.pow(1 + crate, periods)) / (Math.pow(1 + crate, periods) - 1);
        double A = principal * apFactor;
        return A;
    }

}
