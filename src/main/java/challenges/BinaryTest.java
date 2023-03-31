/*
Given an Integer number, n, parse it into bytecode and identify if the fourth bit, from right to left,
is 0 or 1.
 */

package challenges;

public class BinaryTest {

    public static int fourthBit(int number) {

        String decimalString = Integer.toBinaryString(number);
        int fourthBitInt = decimalString.length() - 4;
        char fourthBitChar = decimalString.charAt(fourthBitInt);

        return Character.getNumericValue(fourthBitChar);

    }

    public static void main(String[] args) {

        System.out.println(fourthBit(32));

    }


}
