/*
Given a string 's' and an integer 'k' complete the function so that it finds the lexicographically
smallest and largest substrings of length 'k'.
*/
package io;

import java.util.ArrayList;
import java.util.List;

public class Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;

        List<String> substrings = new ArrayList<>();

        int loop = (s.length() - k) + 1;

        for (int i = 0; i < loop; i++) {
            String string = s.substring(i, k + i);
            substrings.add(string);
        }

        smallest = substrings.get(0);
        largest = substrings.get(0);

        for (String string : substrings) {
            if (string.compareToIgnoreCase(smallest) < 0) {
                smallest = string;
            } else if (string.compareToIgnoreCase(largest) > 0) {
                largest = string;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest("welcometojava", 3));
        System.out.println(getSmallestAndLargest("FlaviaAmaralDiniz", 6));

    }

}
