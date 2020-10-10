package com.example.quicksort;

public class QuickSort {
    public static void quickSork(int[] a, int left, int rigth) {
        /*
         *
         * @param a
	     * @param left
    	 * @param rigth
         * @return void
         * @author liuhong
         * @method
         * @despcription: 左右指针法快速排序
         * @date 2020/10/10 16:06
         */
        //用于判断结束方法
        if(left>=rigth){
            return;
        }
        int p = a[left];
        int i = left;
        int j = rigth;
        int temp;

        while (i < j) {
            while (a[j] >=p && i < j) {
                j--;
            }
            while (a[i] <= p && i < j) {
                i++;
            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        a[left]=a[i];
        a[i]=p;
            quickSork(a,left,i-1);
            quickSork(a,i+1,rigth);
    }
}
