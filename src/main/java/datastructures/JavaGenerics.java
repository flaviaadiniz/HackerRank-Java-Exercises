/*
Let's say you have an integer array and a string array. You have to write a single method printArray that can
print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 */

package datastructures;

import java.lang.reflect.Method;

class Printer {
    public static<T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }
}

public class JavaGenerics {

    public static void main(String[] args) {

        Printer myPrinter = new Printer();

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray")) {
                count++;
            }
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }

}
