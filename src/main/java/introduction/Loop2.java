/*
You are given Q queries in the form of A, B, and N. For each query, print the series corresponding to the
given A, B, and N values as a single line of space-separated integers.
 */

package introduction;

import java.util.Scanner;

public class Loop2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double sum = a;

            for (int j = n; j < n; j++) {
                sum += Math.pow(2,j) * b;
                System.out.print(sum + " ");
            }
        }
        in.close();

        System.out.println();
    }

}
