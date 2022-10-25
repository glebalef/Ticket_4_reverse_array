package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] testArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverseThisArray(testArray)));

    }

    public static int[] reverseThisArray(int[] array) {

        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[array.length - 1 - i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
       return array;
    }
}
