/*
The challenge here is to read N lines of input until you reach EOF, then number and print all N lines of
content.
 */

package introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1 ; scanner.hasNext(); i++){
            System.out.println(i + " " + scanner.nextLine());
        }

    }



}
