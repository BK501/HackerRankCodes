package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * input:
 * 2
 * 0 2 10
 * 5 3 5
 *
 * output:
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 *
 * Explanation:
 * We have two queries:
 * We use a = 0, b = 2, and n = 10 to produce some series : s0, s1, ... sn
 * s0 = 0 + 1*2 = 2
 * s1 = 0 + 1*2 + 2*2 = 6
 * s2 = 0 + 1*2 + 2*2 + 4*2 = 14
 */

public class Intro_JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sn = a + ((int)Math.pow(2, 0)*b);
            for(int j = 1; j<=n; j++) {
                System.out.print(sn+" ");
                sn += ((int)Math.pow(2, j)*b);
            }
            System.out.println();
        }
        in.close();
    }
}
