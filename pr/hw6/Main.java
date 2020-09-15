package com.company.pr.hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        System.out.println("1 Задание");
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        insertionSort(array);
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("2 Задание");
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+ " ");
        }
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        System.out.println();
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+ " ");
        }
        System.out.println();
        System.out.println("3 Задание");
        int[] mas = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        for(int i =0; i< mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        low = 0;
        high = mas.length-1;
        mergeSort(mas,low,high);
        System.out.println();
        for(int i =0; i< mas.length; i++){
            System.out.print(mas[i]+" ");
        }
    }
    public static void insertionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void mergeSort(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
