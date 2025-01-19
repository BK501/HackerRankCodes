package org.example.JavaBasics.Easy;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 * Sample Input
 * 12324.134
 *
 * Sample Output
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 * */

public class Intro_JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Currency usd = Currency.getInstance("USD");
        Currency cny = Currency.getInstance("CNY");
        Currency eur = Currency.getInstance("EUR");

        Locale INDIA = new Locale("en", "IN");
        Currency inr = Currency.getInstance("INR");

        NumberFormat inrFormatter = NumberFormat.getCurrencyInstance(INDIA);
        inrFormatter.setCurrency(inr);
        inrFormatter.setMaximumFractionDigits(2);
        inrFormatter.setMinimumFractionDigits(2);

        NumberFormat usdFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        usdFormatter.setCurrency(usd);

        NumberFormat eurFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        eurFormatter.setCurrency(eur);

        NumberFormat cnyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        cnyFormatter.setCurrency(cny);

        BigDecimal amt = new BigDecimal(payment);
        String currInr = inrFormatter.format(amt);
        if (!currInr.startsWith("Rs.")) {
            currInr = "Rs." + currInr.substring(1);
        }
        String currUs = usdFormatter.format(amt);
        String currFr = eurFormatter.format(amt);
        String currCn = cnyFormatter.format(amt);

        System.out.println("US: " + currUs);
        System.out.println("India: " + currInr);
        System.out.println("China: " + currCn);
        System.out.println("France: " + currFr);
    }
}
