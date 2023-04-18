/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain
them in any ordinary data types like a long integer. Use the power of Java's BigInteger class and solve this
problem.

Input Format
There will be two lines containing two numbers, a and b.

Output Format
Output two lines. The first line should contain a + b, and the second line should contain a * b.
Don't print any leading zeros.
 */

package bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger BigA = scanner.nextBigInteger();
        BigInteger BigB = scanner.nextBigInteger();

        scanner.close();

        System.out.println(BigA.add(BigB));
        System.out.println(BigA.multiply(BigB));

    }

}
