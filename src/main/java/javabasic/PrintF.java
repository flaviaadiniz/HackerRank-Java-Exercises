package io;

import java.util.Scanner;

public class PrintF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %-15s - string com margem esquerda + 15 espaços até o próximo dado
            // %03d - inteiro com 3 dígitos, colocando 0 na frente se tiver menos do que 3 dígitos
            System.out.printf("%-15s%03d \n", s1, x);
        }

        System.out.println("================================");

    }

}
