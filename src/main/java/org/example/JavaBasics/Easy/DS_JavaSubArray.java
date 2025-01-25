package org.example.JavaBasics.Easy;

import java.util.Scanner;

/**
 * Input Format
 *
 * The first line contains a single integer, n, denoting the length of array A = [a0, a1,...,an].
 * The second line contains n space-separated integers describing each respective element, ai, in array A.
 *
 * Constraints
 * 1 <= n <= 100
 * -10^4 <= ai <= 10^4
 *
 * Output Format
 * Print the number of subarrays of A having negative sums.
 *
 * Sample Input
 * 5
 * 1 -2 4 -5 1
 *
 * Sample Output
 * 9
 *
 * Explanation
 * There are nine negative subarrays of A=[1, -2, 4, -5, 1]:
 * 1. [1:1] -> -2
 * 2. [3:3] -> -5
 * 3. [0:1] -> 1 + -2 = -1
 * 4. [2:3] -> 4 + -5 = -1
 * 5. [3:4] -> -5 + 1 = -4
 * 6. [1:3] -> -2 + 4 + -5 = -3
 * 7. [0:3] -> 1 + -2 + 4 + -5 = -2
 * 8. [1:4] -> -2 + 4 + -5 + 1 = -2
 * 9. [0:4] -> 1 + -2 + 4 + -5 + 1 = -1
 * Thus, we print 9 on a new line.
 * */

public class DS_JavaSubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(count(arr));
        scanner.close();
    }

    public static int count(int[] arr) {
        int dem = 0;
        for(int i =0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum =0;
                for(int m = i; m<=j; m++){
                    sum+=arr[m];
                }
                if(sum < 0){
                    dem++;
                }
            }
        }
        return dem;
    }
}
