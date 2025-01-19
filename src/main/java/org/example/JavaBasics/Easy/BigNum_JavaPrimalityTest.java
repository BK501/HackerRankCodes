package org.example.JavaBasics.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Input Format
 * A single line containing an integer, n (the number to be checked).
 * 
 * Constraints
 * n contains at most 100 digits.
 * 
 * Output Format
 * If n is a prime number, print prime; otherwise, print not prime.
 * 
 * Sample Input
 * 13
 * 
 * Sample Output
 * prime
 * 
 * Explanation
 * The only positive divisors of 13 are 1 and 13, so we print prime.
 */

public class BigNum_JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        try {
            BigInteger bigInteger = new BigInteger(n);
            //With certainty level set to 100
            System.out.println(bigInteger.isProbablePrime(100) ? "prime" : "not prime");
        } catch (NumberFormatException e) {
            System.err.println("Please enter the integer digits only: " + e.getMessage());
        }
    }
}
