package com.demoCompany;

public class BubbleSort {

    int [] arr = {1,3,4,6,7,12,4,5,1};

    public static int [] bubbleSort(int [] arr){

        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
