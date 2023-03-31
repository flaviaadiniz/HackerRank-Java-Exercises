package io;

public class Password {

    public static String newPassword(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++){
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }

        for (int i = minLength; i < a.length(); i++){
            sb.append(a.charAt(i));
        }

        for (int i = minLength; i < b.length(); i++){
            sb.append(b.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(newPassword("ABC", "DEF"));

    }

}



