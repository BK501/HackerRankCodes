package org.example.JavaBasics.Easy;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Str_JavaSubStringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

//        List<String> subString = IntStream.rangeClosed(0, s.length() - k)
//                .mapToObj(i -> s.substring(i, i + k))
//                .sorted(Comparator.naturalOrder())
//                .toList();
//
//        smallest = subString.getFirst();
//        largest = subString.getLast();
//        ==================================OR===================================
        smallest = "z";
        for(int i = 0, j = k; j <= s.length(); i++, j++){
            String str = s.substring(i,j);
            if(str.compareTo(smallest) < 0){
                smallest = str;
            }if(str.compareTo(largest) > 0 ){
                largest = str;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
