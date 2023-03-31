/*
Given an integer, n, perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.
*/

package javabasic;



public class IfElseWeird {

    public static void main(String[] args) {

        int n = 24;

        if (n % 2 != 0) {
            System.out.print("Weird");
        } else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.print("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.print("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.print("Not Weird");
        }

    }



}
