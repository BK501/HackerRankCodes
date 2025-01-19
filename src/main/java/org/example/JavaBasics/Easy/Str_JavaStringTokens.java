package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * Input Format
 * A single string, s.
 * <p>
 * Constraints
 * s is composed of the following:
 * English alphabetic letters,
 * blank spaces,
 * exclamation points (!),
 * commas (,),
 * question marks (?),
 * periods (.),
 * underscores (_),
 * apostrophes ('),
 * and at symbols (@).
 * <p>
 * Sample Input
 * He is a very very good boy, isn't he?
 * <p>
 * Sample Output
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */

public class Str_JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String[] tokens = s.trim().split("[^A-Za-z]+");

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String r : tokens) {
                System.out.println(r);
            }
        }
        scan.close();
    }
}
