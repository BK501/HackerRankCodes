package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 * Constraints
 * A will consist at most 50 lower case english letters.
 *
 * Sample Input
 * madam
 *
 * Sample Output
 * Yes
 */

public class Str_JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean flag = true;
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i<A.length()/2; i++) {
            if(A.charAt(i) != A.charAt(A.length()-1-i)) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
