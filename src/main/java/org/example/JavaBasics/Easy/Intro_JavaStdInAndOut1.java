package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * Example Code:
 * Scanner scanner = new Scanner(System.in);
 * String myString = scanner.next();
 * int myInt = scanner.nextInt();
 * scanner.close();
 *
 * System.out.println("myString is: " + myString);
 * System.out.println("myInt is: " + myInt);
 *
 * input:
 * Hi 5
 *
 * output:
 * myString is: Hi
 * myInt is: 5
 *
 * Question:
 * input:
 * 42
 * 100
 * 125
 *
 * output:
 * 42
 * 100
 * 125
 * */

public class Intro_JavaStdInAndOut1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        // Complete this line
//        // Complete this line
//
//        System.out.println(a);
//        // Complete this line
//        // Complete this line

        //given code as above below is ans

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
