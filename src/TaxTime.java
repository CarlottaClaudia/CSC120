import java.util.Scanner;
//---------------------------------
public class TaxTime {
    //---------------------------------Initiating Final Variables
    private static final Scanner keyboard = new Scanner(System.in);

    private static final double STINKINGRICH = 500000;
    private static final double QUITERICH = 200000;
    private static final double MIAMIPOOR = 100000;
    private static final double AVERAGE = 50000;
    private static final double REALISTIC = 20000;

    private static final double TAXRATEA = 0.25;
    private static final double TAXRATEB = 0.10;
    private static final double TAXRATEC = 0.03;


    //---------------------------------

    public static void main(String[] args) {
        double amount;
        double totalincome;
        double totaldeductions;
        double taxableIncome;
        char taxGroup;
        double taxRate;

        totalincome = 0.0;
        totaldeductions = 0.0;
        do {
            System.out.print("Enter next amount : ");
            amount = keyboard.nextDouble();

            if (amount > 0.0) {
                totalincome = totalincome + amount;
            } else {
                totaldeductions = totaldeductions + Math.abs(amount);
            }
        } while (amount != 0.0);

        taxableIncome = computetaxableIncome(totalincome, totaldeductions);
        taxGroup = choosetaxGroup(taxableIncome);
        taxRate = computetaxRate(taxGroup, taxableIncome);
        printTax(totalincome, totaldeductions, taxableIncome, taxGroup, taxRate);
    }

    //--------------------------------

    private static double computetaxableIncome(double totalincome, double totaldeductions) {

        if (totalincome >= totaldeductions) {
            return (totalincome - totaldeductions);
        }
        else {
            return 0.0;
        }

    }
    //-------------------------
    private static char choosetaxGroup(double taxableIncome) {

        if (taxableIncome >= STINKINGRICH) {
            return 'S';
        } else if (taxableIncome >= QUITERICH) {
            return 'Q';
        } else if (taxableIncome >= MIAMIPOOR) {
            return 'M';
        } else if (taxableIncome >= AVERAGE) {
            return 'A';
        } else if (taxableIncome >= REALISTIC) {
            return 'R';
        } else {
            return 'P';
        }
    }

    //-----------------------------------------
    private static double computetaxRate(char taxGroup, double taxableIncome) {
        double tax;
        if (taxGroup == 'S' || taxGroup == 'Q') {
            tax = taxableIncome * TAXRATEA;
        }
        else if (taxGroup == 'M') {
            tax = taxableIncome * TAXRATEB;
        }
        else if (taxGroup == 'A' || taxGroup == 'R') {
            tax = taxableIncome * TAXRATEC;
        }
        else if (taxGroup == 'P') {
            tax = 0.0;
        }
        else {
            System.out.print("Error!");
            tax = 0.0;
        }
        return(tax);
    }
//------------------

    private static void printTax(double totalincome, double totaldeductions, double taxableIncome, char taxGroup, double taxRate) {

        System.out.println("Income         = $" + totalincome);
        System.out.println("Deductions     = $" + totaldeductions);
        System.out.println("Taxable income = $" + taxableIncome);
        System.out.println("Tax group      = " + taxGroup);
        System.out.println("Tax owed       = $" + taxRate);
    }

}

