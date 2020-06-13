package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {10,11,12,13,14,15};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
