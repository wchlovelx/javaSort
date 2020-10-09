package com.example.insertionsort;

import java.util.Random;

public class InsertionSort {
    public int[] insertionSort(int max){
        /*
         *
         * @param max
         * @return int[]
         * @author liuhong
         * @method
         * @despcription: 用插入排序得到一个长度为max有序数组,0-99
         * @date 2020/10/9 9:30
         */

        int[] arry=getarry(max);
        int nnums=arry.length;
        for(int i=1;i<nnums;i++){
            for(int j=i;j>0;j--){
                if(arry[j]<arry[j-1]){
                    arry[j]=arry[j]^arry[j-1];
                    arry[j-1]=arry[j]^arry[j-1];
                    arry[j]=arry[j]^arry[j-1];
                }
            }
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
