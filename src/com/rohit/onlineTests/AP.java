package com.rohit.onlineTests;
import java.io.*;
import java.util.Scanner;
/**
 * Created by PPP on 1/12/2015
 * .
 */
public class AP {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        Integer arr[] = new Integer[2500];
        int n= sc.nextInt();
        int diff1 = 0;

        int x[][] = new int[10][20];

        int diff2 = 0;


        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        if( (arr[1] - arr[0]) == (arr[2] - arr[1]))
            diff2 = arr[1] - arr[0];
        else if( (arr[3] - arr[2]) == (arr[2] - arr[1]) )
            diff2 = arr[3] - arr[2];
        else if((arr[3] - arr[2]) == (arr[1] - arr[0]) )
            diff2 = arr[3] - arr[2];


        for(int i=1;i<n;i++) {
            diff1 = arr[i] - arr[i-1];

            if(diff1 == 2*diff2)
                System.out.println(arr[i-1] + diff2);
        }
    }
}