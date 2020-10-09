package com.example.insertionsort;

public class InsertionSortTest {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] sort = insertionSort.insertionSort(10);
        for(int i=0;i<sort.length;i++){
            System.out.println(sort[i]);
        }
    }
}
