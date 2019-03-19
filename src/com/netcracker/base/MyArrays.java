package com.netcracker.base;

import java.util.*;

public class MyArrays {
    static Random rnd=new Random();
    static void taskA(){
        System.out.println("task a:");
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 2 * i + 1;
        System.out.println("Array in ascending order:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Array in descending order:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void taskB(){
        System.out.println("task b:");
        int[] arr=rnd.ints(20,0,11).toArray();
        for (int i = 0; i < 20; i++)
            System.out.print(arr[i] + " ");
        int even = 0, odd = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i]%2 == 0) even++;
            else odd++;
        }
        System.out.println();
        System.out.println("even items: " + even);
        System.out.println("odd items: " + odd);
        System.out.println();

    }
    static void taskC(){
        System.out.println("task c:");
        int[] arr=rnd.ints(10,1,101).toArray();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if(i%2!=0)arr[i]=0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();



    }
    static void taskD(){
        System.out.println("task d:");
        int[] arr=rnd.ints(15,-50,51).toArray();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int minI = 0, maxI = 0;
        for (int i = 0; i < arr.length; ++i) {
            minI = (arr[minI] >= arr[i]) ? i : minI;
            maxI = (arr[maxI] <= arr[i]) ? i : maxI;
        }
        System.out.println("Min element: " + arr[minI] + ", index=" + minI);
        System.out.println("Max element: " + arr[maxI] + ", index=" + maxI);
        System.out.println();

    }
    static void taskE(){
        System.out.println("task e:");
        int[] arr1=rnd.ints(10,0,11).toArray();
        int[] arr2=rnd.ints(10,0,11).toArray();
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();
        int avr1= Arrays.stream(arr1).sum()/arr1.length;
        int avr2= Arrays.stream(arr2).sum()/arr2.length;
        if (avr1 > avr2)
            System.out.println("firs array is bigger");
        if (avr1 == avr2)
            System.out.println("arrays is equal ");
        if (avr1 < avr2)
            System.out.println("second array is bigger");
        System.out.println();

    }
    static void taskF(){
        System.out.println("task f:");
        int[] arr=rnd.ints(20,-1,2).toArray();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int[] counter={0,0,0};
        for (int i:
             arr) {
            switch (i){
                case -1: counter[0]++; break;
                case 0: counter[1]++; break;
                case 1: counter[2]++;break;
            }

        }
        int max= Arrays.stream(counter).max().getAsInt();
        if(max==counter[0]) System.out.print(-1);
        if(max==counter[1]) System.out.print(0);
        if(max==counter[2]) System.out.print(1);

    }

    public static void main(String[] args) {
        taskA();
        taskB();
        taskC();
        taskD();
        taskE();
        taskF();

    }
}
