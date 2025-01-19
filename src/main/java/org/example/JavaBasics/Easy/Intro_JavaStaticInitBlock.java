package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * There are two lines of input.
 * The first line contains B : the breadth of the parallelogram.
 * The next line contains H : the height of the parallelogram.
 *
 * If both values are greater than zero,
 * then the main method must output the area of the parallelogram. Otherwise,
 * print "java.lang.Exception: Breadth and height must be positive" without quotes.
 * */

public class Intro_JavaStaticInitBlock {

    //    Write your code here
    static int B, H = 0;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        try {
            B = sc.nextInt();
            H = sc.nextInt();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class