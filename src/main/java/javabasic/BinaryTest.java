package io;

public class BinaryTest {

    public static int fourthBit(int number) {

        String decimalString = Integer.toBinaryString(number);
        int fourthBitCharPosition = decimalString.length() - 4;
        char fourthBitChar = decimalString.charAt(fourthBitCharPosition);
        int result = Character.getNumericValue(fourthBitChar);

        return result;

    }

    public static void main(String[] args) {

        System.out.println(fourthBit(32));

    }


}
