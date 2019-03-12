package base.ru.netcracker;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    static Random rnd=new Random();
    static void taskA(){
        System.out.println("task a:");
        int[][] arr=new int[8][8];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<8;j++)
                arr[i][j]=rnd.nextInt(99)+1;
        }
        int prod=1,sum=0, prod2=1, sum2=0;
        for(int i=0;i<8;i++)
        {
            sum+=arr[i][i];
            prod*=arr[i][i];
            sum2+=arr[i][arr.length-1-i];
            prod2*=arr[i][arr.length-1-i];
        }
        System.out.println(" main sum=" + sum + ", multiplication=" + prod);
        System.out.println("secondary sum =" + sum2 + ", multiplication=" + prod2);
        System.out.println();
    }
    static void taskB(){
        System.out.println("task b:");
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                arr[i][j] = rnd.nextInt(201) - 99;
        }

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        int max=arr[0][0], maxX=0,maxY=0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    maxX=i;
                    maxY=j;
                }
        }
        System.out.println("max item: arr["+maxX+"]["+maxY+"]="+max);

        System.out.println();

    }
    static void taskC(){
        System.out.println("task c:");
        int[][] arr = new int[8][5];
        for(int i=0;i<arr.length;i++)
            arr[i]=rnd.ints(5,-10,10).toArray();
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        int[] rowProd=new int[8];
        for(int i=0;i<arr.length;i++){
            rowProd[i]= Math.abs(Arrays.stream(arr[i]).reduce((x,y)->x*y).getAsInt());
        }
        int max=rowProd[0], maxI=0;
        for(int i=1;i<rowProd.length;i++){
            if(rowProd[i]>max){
                max=rowProd[i];
                maxI=i;
            }
        }
        System.out.println("row with max module:"+maxI);

        System.out.println();

    }
    static void taskD(){
        System.out.println("task d:");
        int[][] arr = new int[10][7];
        for(int i=0;i<arr.length;i++)
            arr[i]=rnd.ints(7,0,101).toArray();
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        System.out.println("sorted array:");
        Arrays.sort(arr, (x,y)->y[0]-x[0]);
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        taskA();
        taskB();
        taskC();
        taskD();

    }
}
