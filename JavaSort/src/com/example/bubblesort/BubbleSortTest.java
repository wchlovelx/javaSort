package com.example.bubblesort;

public class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] bubbleSort = sort.bubbleSort(10);
       for(int i=0;i<bubbleSort.length;i++){
           System.out.println(bubbleSort[i]);
       }
    }
}
