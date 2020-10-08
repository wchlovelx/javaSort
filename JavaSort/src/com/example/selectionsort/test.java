package com.example.selectionsort;

public class test {
    public static void main(String[] args) {
        int[] arry={21,54,0,546,1,54,2};
        int temp;
        int nnums=arry.length;
        for(int i=0;i<nnums-1;i++){
            temp=i;
            for(int j=i+1;j<nnums;j++){
                if(arry[j]<=arry[temp]){
                    temp=j;
                }
            }
            if(i!=temp){
                arry[i]=arry[i]+arry[temp];
                arry[temp]=arry[i]-arry[temp];
                arry[i]=arry[i]-arry[temp];
            }
        }
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
