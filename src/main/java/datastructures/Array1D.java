/*
Create an array, a, capable of holding n integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
For example, the first value must be stored in a[0], the second value must be stored in a[1], and so on.
 */

package datastructures;

import java.util.Scanner;

public class Array1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers in the array? ");
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Type the number: ");
            a[i] = scan.nextInt();
        }

        scan.close();

        for (int num : a) {
            System.out.println(num);
        }

    }

}
