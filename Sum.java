package com.company;

public class Sum {

    public static void main(String[] args) {
        int[] array = {2, -9, 12, 33, 4, -2, 1234};
        double sum = 0;
        for (int i : array) {
            if (i > 0)
                sum += i;
        }
        System.out.print("answer: " + sum);
    }
}
