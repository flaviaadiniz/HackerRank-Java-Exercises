/*
Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to
specify one using some well-defined syntax.
In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Input Format
The first line of input contains an integer , denoting the number of test cases. The next  lines contain a
string of any printable characters representing the pattern of a regex.

Output Format
For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid.
Do not print the quotes.
 */

package javabasic;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many patterns are you going to check? ");
        int testCases = Integer.parseInt(scanner.nextLine());

        while(testCases > 0){
            System.out.print("Type your pattern: ");
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            } finally {
                testCases--;
            }

        }
    }


}
