package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que a lista terá: ");
        int listSize = scanner.nextInt();
        scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            list.add(scanner.nextInt());
        }

        System.out.print("Digite o número de consultas que deseja fazer: ");
        int queries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queries; i++) {

            System.out.print("Digite 'Insert' para trocar um número da lista ou 'Delete' para excluir um" +
                    " número da lista: ");
            String operation = scanner.next();

            if (operation.equals("Insert")) {

                System.out.print("Em qual posição deseja adicionar o número? ");
                int index = scanner.nextInt();
                System.out.print("Qual o valor a ser inserido na posição? ");
                int value = scanner.nextInt();

                list.add(index, value);
                System.out.println("Current list: " + list);

            } else if (operation.equals("Delete")) {

                System.out.print("Digite o index do número a ser deletado: ");
                int index = scanner.nextInt();

                list.remove(index);
                System.out.println("Current list: " + list);

            }

        }

        System.out.println("Final list: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}

