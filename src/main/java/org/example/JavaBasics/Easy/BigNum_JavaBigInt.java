package org.example.JavaBasics.Easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Input Format
 * There will be two lines containing two numbers, a and b.
 *
 * Constraints
 * a and b are non-negative integers and can have maximum 200 digits.
 *
 * Output Format
 * Output two lines.
 * The first line should contain a+b, and the second line should contain axb.
 * Don't print any leading zeros.
 *
 * Sample Input
 * 1234
 * 20
 *
 * Sample Output
 * 1254
 * 24680
 *
 * Explanation
 * 1234 + 20 = 1254
 * 1234 * 20 = 24680
 */

public class BigNum_JavaBigInt {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        BigInteger bia = new BigInteger(a);
        BigInteger bib = new BigInteger(b);
        BigInteger sum, multiply;

        sum = bia.add(bib);
        multiply = bia.multiply(bib);

        System.out.println(sum);
        System.out.println(multiply);
    }
}
