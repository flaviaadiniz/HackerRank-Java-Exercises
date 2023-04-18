package datastructures;

import java.util.Scanner;


public class SubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numArray = new int[n];

        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }

        int[] subArrays;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                for (int k = i; k <= j; k++) {

                }
            }
        }




    }

}
