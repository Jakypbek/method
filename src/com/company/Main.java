package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
            System.out.print(ints[i] + " ");
        }
        min(ints);
        max(ints);
    }
    static void min (int[] a) {
        int minNumber = a[0];
        for (int i = 1; i < a.length; i++) {
            if (minNumber > a[i]) {
                minNumber = a[i];
            }
        }
        System.out.println("\nМинимальный элемент: " + minNumber);
    }
    static void max (int[] a) {
        int maxNumber = a[0];
        for (int i = 1; i < a.length; i++) {
            if (maxNumber < a[i]) {
                maxNumber = a[i];
            }
        }
        System.out.println("Максимальный элемент: " + maxNumber);
    }
}
