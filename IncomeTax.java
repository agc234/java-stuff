/**
 * IncomeTax
 */
public class IncomeTax {

    public static void main(String[] args) {
        double income = Double.parseDouble(args[0]);
        double tax = federalIncomeTax(income);
        System.out.println("The total tax charged is $" + tax);
        System.out.println("The effective income is $" + (income - tax));
    }

    public static double federalIncomeTax(double income) {
        double tax;
        if (9701 > income) {
            tax = 0.1 * income;
            return tax;
        } else if (39476 > income && income >= 9701) {
            double taxable = income - 9701;
            return tax = taxable * 0.12 + 970;
        } else if (84201 > income && income >= 39476) {
            double taxable = income - 39476;
            return tax = taxable * 0.22 + 4543;
        } else if (160726 > income && income >= 84201) {
            double taxable = income - 84201;
            return tax = taxable * 0.24 + 14382.50;
        } else if (204101 > income && income >= 160726) {
            double taxable = income - 160726;
            return tax = taxable * 0.32 + 32748.50;
        } else if (510301 > income && income >= 204101) {
            double taxable = income - 204101;
            return tax = taxable * 0.35 + 46628.50;
        } else {
            double taxable = income - 510301;
            return tax = taxable * 0.37 + 153798.50;
        }
    }
}