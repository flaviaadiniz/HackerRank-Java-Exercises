/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print "Yes" if it is a palindrome, print "No" otherwise.
 */

package strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Digite uma palavra ou número para descobrir se é um palíndromo: ");
        String A = sc.next();

        boolean isPalindrome = false;
        StringBuilder newString = new StringBuilder();


        for (int i = A.length() - 1 ; i >= 0; i--) {
            newString.append(A.charAt(i));
        }

        for (int i = 0; i < A.length(); i++) {
            if (newString.charAt(i) != A.charAt(i)) {
                System.out.println("No");
                break;
            } else {
                isPalindrome = true;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        }

    }

}
