package com.netcracker.base;
import java.util.Random;

public class Branches {
    enum day_of_week{Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    static void taskA(){
        day_of_week[] days={day_of_week.Sunday, day_of_week.Monday, day_of_week.Tuesday, day_of_week.Wednesday,
                day_of_week.Thursday, day_of_week.Friday, day_of_week.Saturday};
        long startTime = System.nanoTime();
        for (day_of_week d: days) {
            if (d==day_of_week.Monday) System.out.println("today is monday");
            else if(d==day_of_week.Tuesday) System.out.println("today is tuesday");
            else if(d==day_of_week.Wednesday) System.out.println("today is wednesday");
            else if(d==day_of_week.Thursday) System.out.println("today is thursday");
            else if(d==day_of_week.Friday) System.out.println("today is friday");
            else if(d==day_of_week.Saturday) System.out.println("today is saturday");
            else if(d==day_of_week.Sunday) System.out.println("today is sunday");

        }
        System.out.println("\tif else time: "+(System.nanoTime()-startTime));
        startTime = System.nanoTime();
        for (day_of_week d: days){
            switch (d){
                case Sunday: System.out.println("today is sunday");break;
                case Monday: System.out.println("today is monday");break;
                case Tuesday: System.out.println("today is tuesday");break;
                case Wednesday: System.out.println("today is wednesday");break;
                case Thursday: System.out.println("today is thursday");break;
                case Friday: System.out.println("today is friday");break;
                case Saturday:System.out.println("today is saturday");break;
            }
        }
        System.out.println("\tswitch time: "+(System.nanoTime()-startTime));

    }
    static void taskB(){
        Random rnd=new Random();
        int[] arr=rnd.ints(50,0,11).toArray();
        int[] count=new int[11];
        long startTime = System.nanoTime();
        for (int i:arr) {
            switch (i){
                case 0: count[i]++;break;
                case 1: count[i]++;break;
                case 2: count[i]++;break;
                case 3: count[i]++;break;
                case 4: count[i]++;break;
                case 5: count[i]++;break;
                case 6: count[i]++;break;
                case 7: count[i]++;break;
                case 8: count[i]++;break;
                case 9: count[i]++;break;
                case 10: count[i]++;break;

            }
        }
         System.out.println("\tif else time: "+(System.nanoTime()-startTime));
         for (int i=0;i<count.length;i++){
             System.out.print(i+"=>"+count[i]+"; ");
         }
        int[] count2=new int[11];
         startTime = System.nanoTime();
        for (int i:arr) {
            switch (i){
                case 0:count2[i]++;break;
                case 1:count2[i]++;break;
                case 2:count2[i]++;break;
                case 3:count2[i]++;break;
                case 4:count2[i]++;break;
                case 5:count2[i]++;break;
                case 6:count2[i]++;break;
                case 7:count2[i]++;break;
                case 8:count2[i]++;break;
                case 9:count2[i]++;break;
                case 10:count2[i]++;break;
            }
        }
         System.out.println("\n\tswitch time: "+(System.nanoTime()-startTime));
        
        for (int i=0;i<count2.length;i++){
            System.out.print(i+"=>"+count2[i]+"; ");
        }


    }

    public static void main(String[] args) {
        System.out.println("-------- task a-----------");
        taskA();
        System.out.println("-------- task b-----------");
        taskB();
    }

}
