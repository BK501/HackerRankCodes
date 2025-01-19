package org.example.JavaBasics.Easy;

import java.util.Scanner;

public class Intro_JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String str;
        while(sc.hasNext()) {
            str = sc.nextLine();
            a++;
            System.out.println(a + " " + str);
            if(str.endsWith("Read me until end-of-file.")) {
                break;
            }
        }
    }
}
