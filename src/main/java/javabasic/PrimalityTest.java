/*
Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print
whether it's prime or not prime.
 */

package javabasic;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number to find out if it is prime: ");
        String n = scanner.nextLine();

        BigInteger bigN = new BigInteger(n);
        boolean result = bigN.isProbablePrime(1);

        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

}
