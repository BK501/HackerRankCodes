package org.example.JavaBasics.Easy;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Input Format
 * The first line of input contains an integer N,
 * denoting the number of test cases.
 * The next N lines contain a string of any printable characters representing the pattern of a regex.
 * <p>
 * Output Format
 * For each test case, print Valid if the syntax of the given pattern is correct.
 * Otherwise, print Invalid. Do not print the quotes.
 * <p>
 * Sample Input
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 * <p>
 * Sample Output
 * Valid
 * Invalid
 * Invalid
 */

public class Str_PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}
