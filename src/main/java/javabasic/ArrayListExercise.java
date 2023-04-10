package javabasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //number of lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(); //stores lines as ArrayLists

        //read input lines
        for (int i = 0; i < n ; i++) {

            int d = scanner.nextInt(); //number of integers in the line

            ArrayList<Integer> line = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }

            lines.add(line);

        }

        int q = scanner.nextInt(); //number of queries

        for (int i = 0; i < q; i++) {

            int x = scanner.nextInt(); //line number
            int y = scanner.nextInt(); //position in the line

            if (x > 0 && x <= n && y > 0 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1)); //print number at position y in line x
            } else {
                System.out.println("ERROR!"); //when position is out of bounds
            }

        }

        scanner.close();

    }

}