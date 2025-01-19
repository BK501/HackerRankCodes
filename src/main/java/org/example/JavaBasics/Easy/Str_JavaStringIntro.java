package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * Input Format
 * The first line contains a string A.
 * The second line contains another string B.
 * The strings are comprised of only lowercase English letters.
 *
 * Output Format
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 * For the third line, capitalize the first letter in both A and B and print them on a single line,
 * separated by a space.
 *
 * Sample Input 0
 * hello
 * java
 *
 * Sample Output 0
 * 9
 * No
 * Hello Java
 * Explanation 0
 *
 * String A is "hello" and B is "java".
 * A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
 * When sorted alphabetically/lexicographically, "hello" precedes "java";
 * therefore, A is not greater than B and the answer is No.
 *
 * When you capitalize the first letter of both A and B and then print them separated by a space,
 * you get "Hello Java".
 * */

public class Str_JavaStringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sizeA = A.length();
        int sizeB = B.length();
        int sum = sizeA + sizeB;

        String capitalA = "", capitalB = "";
        boolean isLexicographically = true;

        // Check lexicographical order
        if (A.compareTo(B) > 0) {
            isLexicographically = false;
        }

        // Capitalize the first letter of both strings
        capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Output results
        System.out.println(sum);
        if (isLexicographically) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(capitalA + " " + capitalB);
    }
}
