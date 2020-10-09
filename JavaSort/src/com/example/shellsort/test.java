package com.example.shellsort;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class test {
    public static void main(String[] args) {
        int[] arry={21,54,0,546,1,54,2,10,10,34};
        int nnums=arry.length;
        int increment=1;
        while (increment<nnums/3){
            increment=increment*3+1;
        }
        while (increment>0){
            for(int i=increment;i<nnums;i++){

                for(int j=i;j-increment>=0;j=j-increment){
                    if(arry[j]>=arry[j-increment]){
                        break;
                    }
                    if(arry[j]<arry[j-increment]){
                        arry[j]=arry[j]^arry[j-increment];
                        arry[j-increment]=arry[j]^arry[j-increment];
                        arry[j]=arry[j]^arry[j-increment];
                    }
                }
            }
            increment=(increment-1)/3;
        }




        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }

}
