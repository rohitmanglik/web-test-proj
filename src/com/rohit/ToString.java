package com.rohit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PPP on 1/8/2015.
 *//*
public class ToString {

    void fixArrayList(ArrayList<Integer> array) {
        array.add(23);
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer arr[] = new Integer[2500];
        int n= sc.nextInt();
        int diff1 = 0;
        int diff2 = 0;


        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        if( (arr[1] - arr[0]) == (arr[2] - arr[1]))
            diff2 = arr[1] - arr[0];
        else if( (arr[3] - arr[2]) == (arr[2] - arr[0]))
            diff2 = arr[3] - arr[2];*//*
        else if((arr[3] - arr[2]) == (arr[1] - arr[0])*//*
        diff2 = arr[3] - arr[2];
        for(int i=1;i<n;i++) {
            diff1 = arr[i] - arr[i-1];

            if(diff1 == 2*diff2)
                System.out.println(arr[i-1] + diff2);
        }
        *//* Enter your code here. Read input from STDIN. Print output to STDOUT *//*
    }

    void start()
    {

        Scanner sc = new Scanner(System.in);
        Integer arr[] = new Integer[2500];
        int n= sc.nextInt();
        int diff1 = 0;
        int diff2 = 0;


        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        if( (arr[1] - arr[0]) == (arr[2] - arr[1]))
            diff2 = arr[1] - arr[0];
        else if( (arr[3] - arr[2]) == (arr[2] - arr[0])
        diff2 = arr[3] - arr[2];

        for(int i=1;i<n;i++) {
            diff1 = arr[i] - arr[i-1];

            if(diff1 == 2*diff2)
                System.out.println(arr[i-1] + diff2);
        }


        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(12);
        fixArrayList(array);

        byte by;


        float x = 100;
        long y = 100L;
        double d = 12.1;
        int z = 10;

        by = (byte) y;
        z=(int) y;



        boolean b = (x == y); *//* Line 7 *//*
        System.out.println(by);

        System.out.println(array.toString());


        Integer t = 0;
        System.out.print(t + " ");
        fix(t);
        System.out.println(t+ " " );
    }

    void fix(Integer tt)
    {
        tt = 42;
    }

    void start1()
    {
        Long [] a1 = {3L,4L,5L};
        Long [] a2 = fix(a1);
        System.out.print(a1[0].toString() + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    Long [] fix(Long [] a3)
    {
        Integer i=7;
        a3[1] = Long.parseLong(i.toString());
        return a3;
    }
}

class Two
{
    byte x;
}

*/