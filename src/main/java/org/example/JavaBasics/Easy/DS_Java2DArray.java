package org.example.JavaBasics.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Input Format
 * There will be exactly 6 lines, each containing 6 integers separated by spaces.
 * Each integer will be between -9 and 9 inclusive.
 * <p>
 * Output Format
 * Print the answer to this problem on a single line.
 * <p>
 * Sample Input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * <p>
 * Sample Output
 * 19
 * <p>
 * Explanation
 * The hourglass which has the largest sum is:
 * 2 4 4
 * 2
 * 1 2 4
 */

public class DS_Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> array = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            array.add(arrRowItems);
        }
        bufferedReader.close();
        System.out.println(findlarges(array));
    }

    public static int findlarges(List<List<Integer>> a) {
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int sum = 0;
                sum += a.get(i).get(j) + a.get(i+1).get(j-1) + a.get(i+1).get(j) + a.get(i+1).get(j+1)
                        + a.get(i-1).get(j-1) + a.get(i-1).get(j) + a.get(i-1).get(j+1);
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        return largest;
    }
}
