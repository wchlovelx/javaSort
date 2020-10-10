package com.example.quicksort;

public class test {
    public static void main(String[] args) {
        int[] arry = {21, 54, 0, 546, 1, 54, 2, 10, 10, 34};
        int[] arry1={9,8,7,6,5,4,3,2,1};
        QuickSort Sort = new QuickSort();
        Sort.quickSork(arry,0,9);
        Sort.quickSork(arry1,0,8);

        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
    }




   /* public static void quickSork(int[] a, int left, int rigth) {
        int p = a[left];
        int i = left;
        int j = rigth;
        int temp;
        if(left>=rigth){
            return;
        }
        while (i < j) {
            while (a[j] >=p && i < j) {
                j--;
            }
            while (a[i] <= p && i < j) {
                i++;
            }
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        a[left]=a[i];
        a[i]=p;
        quickSork(a,left,i-1);
        quickSork(a,i+1,rigth);
    }*/
}
