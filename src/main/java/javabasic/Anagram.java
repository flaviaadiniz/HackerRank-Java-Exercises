/*
Two strings, 'a' and 'b', are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive.
Complete the isAnagram function in the editor. If 'a' and 'b' are case-insensitive anagrams, return true.
Otherwise, return false.
*/

package javabasic;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        boolean isAnagram = true;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for(int i = 0; i < arrayA.length ; i++){
            if(arrayA[i] != arrayB[i]){
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams!");
        } else {
            System.out.println("Not anagrams!");
        }

        return isAnagram;

    }

    public static void main(String[] args) {

        isAnagram("ABC", "CBA");
        isAnagram("CaT", "BAt");

    }

}
