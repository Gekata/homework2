package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        Integer[] arrayOfInts = {2, 3, 1, 7, 11};
        Arrays.sort(arrayOfInts, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayOfInts));
    }
}
