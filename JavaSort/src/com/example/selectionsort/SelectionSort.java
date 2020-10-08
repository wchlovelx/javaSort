package com.example.selectionsort;

import java.util.Random;

public class SelectionSort {
    public int[] Selectionsort(int max){
        /*
         *
         * @param max
         * @return int[]
         * @author liuhong
         * @method
         * @despcription: 用选择排序得到一个长度为max有序数组,0-99
         * @date 2020/10/8 22:24
         */

        int[] arry=getarry(max);
        int temp;
        int nnums=arry.length;
        for(int i=0;i<nnums-1;i++){
            temp=i;
            for(int j=i+1;j<nnums;j++){
                if(arry[j]<arry[temp]){
                    temp=j;
                }
            }
            //这个判断十分有必要，当元素找不到比他小的值时，i和temp的值相等的情况下，进行以下异或会将值改为0
            if(temp!=i){
                arry[temp]=arry[temp]+arry[i];
                arry[i]=arry[temp]-arry[i];
                arry[temp]=arry[temp]-arry[i];
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
