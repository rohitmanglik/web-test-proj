package com.rohit;

/**
 * Created by PPP on 1/6/2015.
 */
public class MergeSort {
    static Integer[] arr = new Integer[7];
    void mergeSorting(int startIndex, int endIndex){
        int between = Math.abs((startIndex + endIndex)/2);
        if(endIndex - startIndex >1 ) {
            if ((between - startIndex) > 0) mergeSorting(startIndex, between);
            if ((endIndex - (between + 1)) > 0) mergeSorting(between + 1, endIndex);
            merge(startIndex, between, endIndex);
        }
    }


    private void merge(int lowerBound, int middle, int upperBound) {
        int i=lowerBound;
        int j=middle+1;
        int k=upperBound;

        Integer mergedArray[] = new Integer[7];

/*
        while(i<= middle && j<=upperBound) {
            if()
        }

        for (int i = a; i < (endIndex - a); i++) {
            arr[i] = mergedArray[i];
        }
*/
    }


    public static void main(String[] args)
    {
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 4;
        arr[4] = 7;
        arr[5] = 5;
        arr[6] = 6;

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSorting(0, 7);

        for(int i=0;i<7;i++)
            System.out.println(arr[i]);

    }
}
