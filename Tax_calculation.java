package taxation;

import java.util.Scanner;

public class Tax_calculation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert your annual income: ");
        double income = scan.nextDouble();
        scan.close();

        double tax = forologia(income);
        System.out.println("The calculated tax you must pay is: " + String.format("%.2f", tax) + "€");
    }

    public static double forologia(double forolog) {
        if (forolog <= 0) {
            return 0.0;
        }
        if (forolog <= 11000) {
            return forolog * 0.20;
        } else {
            return forolog * 0.25;
        }
    }
}