package com.example.shellsort;

public class ShellSortTest {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] ints = shellSort.Shellsort(10);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
