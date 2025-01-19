package org.example.JavaBasics.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Str_JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;
        char[] aLowerCase = a.toLowerCase().toCharArray();
        char[] bLowerCase = b.toLowerCase().toCharArray();
        Arrays.sort(aLowerCase);
        Arrays.sort(bLowerCase);
        return Arrays.equals(aLowerCase, bLowerCase);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
