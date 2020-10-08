package com.example.bubblesort;
import java.util.Random;

public class BubbleSort {
     int[] arry;
     int nnums;
    public int[] bubbleSort(int max){
        /*
         *
         * @param max
         * @return int[]
         * @author liuhong
         * @method
         * @despcription: 用冒泡排序得到一个长度为max有序数组,0-99
         * @date 2020/10/8 19:01
         */

        arry=new int[max];
        nnums=max;
        for(int i=0;i<nnums;i++){
            arry[i]=new Random().nextInt(100);
        }
        for (int i = 0; i <nnums-1 ; i++) {
            for(int j=0;j<nnums-i-1;j++){
                if(arry[j]>arry[j+1]){
                    arry[j]=arry[j+1]^arry[j];
                    arry[j+1]=arry[j+1]^arry[j];
                    arry[j]=arry[j+1]^arry[j];
                }
            }
        }
        return arry;
    }
}
