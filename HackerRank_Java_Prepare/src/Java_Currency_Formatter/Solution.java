package Java_Currency_Formatter;
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat currencyFormatter;
        // us
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyFormatter.format(payment);
        // india
        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        DecimalFormatSymbols symbols = ((DecimalFormat) currencyFormatter).getDecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs.");
        ((DecimalFormat) currencyFormatter).setDecimalFormatSymbols(symbols);
        String india = currencyFormatter.format(payment);
        // china
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatter.format(payment);
        // france
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}