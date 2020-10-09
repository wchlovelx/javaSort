package com.example.insertionsort;

public class test {
    public static void main(String[] args) {
        int[] arry={21,54,0,546,1,54,2};
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
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
