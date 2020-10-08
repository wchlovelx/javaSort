package com.example.selectionsort;

public class SelectionSortTest {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        int[] sort = selection.Selectionsort(10);
       for(int i=0;i<sort.length;i++){
           System.out.println(sort[i]);
       }
    }
}
