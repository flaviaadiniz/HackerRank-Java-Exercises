/*
Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define
a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed
by each token on a new line.
 */

package javabasic;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] tokens = s.split("[!,?._'@ ]+");

            System.out.println(tokens.length);
            for (String t : tokens) {
                System.out.println(t);
            }
        }

        scan.close();
    }

}
