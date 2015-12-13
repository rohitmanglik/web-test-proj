package com.rohit;

import com.rohit.syntaxLearn.InterfaceImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PPP on 1/3/2015.
 */
public class Main {

   private static int count = 0;
    int a [] = new int[5];
    float f = 12;
    public static void main(String[] args) {

        InterfaceImplement interfaceImplement = new InterfaceImplement().factoryTest();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count++;
                    System.out.println("t1");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count++;
                    System.out.println("t2");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is "+ count);



        List<Integer> numbers = new ArrayList();

        System.out.println();

        int a = 0;
        int b = 12;
        numbers.add(b);
        numbers.add(20);
        numbers.add(39);

        for (Integer number : numbers) {
            System.out.println(number);
        }

/*
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();

*/

        Main main = new Main();
        main.doTimings();

    }

    public void doTimings() {

        List<Integer> linkedList = new ArrayList<Integer>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++) {
            linkedList.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Difference in time is " + (end - start));
    }
}