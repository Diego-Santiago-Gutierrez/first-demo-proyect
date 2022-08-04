package com.demoCompany;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] arr = BubbleSort.bubbleSort(new int[]{1, 2, 34, 8, 5, 1, 3, 8, 9, 1});

        Arrays.stream(arr).forEach(System.out::println);

    }
}
