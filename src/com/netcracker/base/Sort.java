package com.netcracker.base;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    static long bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        boolean k = false;
        while(!k) {
            k = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    k = false;
                }
            }
        }

        return System.nanoTime() - startTime;
    }
    static long selectionSort(int[] arr) {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                min = arr[min] > arr[j] ? j : min;
            if (min != i) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return System.nanoTime() - startTime;
    }
    static long arraySort(int[] arr) {
        long startTime = System.nanoTime();
        Arrays.sort(arr);
        return System.nanoTime() - startTime;
    }



    public static void main(String[] args){
        Random rnd=new Random();
        int[] ar=rnd.ints(10000,0,20000).toArray();
        int[] bubbleSortArr= ar.clone();
        int[] selectionSortArr=ar.clone();
        int[] arraySortArr=ar.clone();

        System.out.println("BubbleSort time: " + bubbleSort(bubbleSortArr));
        System.out.println("SelectionSort time: " + selectionSort(selectionSortArr));
        System.out.println("ArraySort time: " + arraySort(arraySortArr));


    }
}
