/*
Given an array of  integers, find and print its number of negative subarrays on a new line.
 */

package datastructures;

import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];

        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += numArray[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
