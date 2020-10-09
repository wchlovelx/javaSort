package com.example.shellsort;

import java.util.Random;

public class ShellSort {
    public int[] Shellsort(int max){
        /*
         *
         * @param max
         * @return int[]
         * @author liuhong
         * @method
         * @despcription: 用希尔排序得到一个长度为max有序数组,0-99
         * @date 2020/10/9 19:14
         */

        int[] arry=getarry(max);
        int nnums=arry.length;
        int increment=1;
        while (increment<nnums/3){
            increment=increment*3+1;
        }
        while (increment>0){
            for(int i=increment;i<nnums;i++){

                for(int j=i;j-increment>=0;j=j-increment){
                    if(arry[j]>=arry[j-increment]){
                        break;
                    }
                    if(arry[j]<arry[j-increment]){
                        arry[j]=arry[j]^arry[j-increment];
                        arry[j-increment]=arry[j]^arry[j-increment];
                        arry[j]=arry[j]^arry[j-increment];
                    }
                }
            }
            increment=(increment-1)/3;
        }
        return arry;
    }
    public int[] getarry(int max){
        int [] arry=new int[max];
        for(int i=0;i<max;i++){
            arry[i]=new Random().nextInt(100);
        }
        return arry;
    }
}
