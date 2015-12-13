package com.rohit;

/**
 * Created by PPP on 1/3/2015.
 */
public class MyThreadCount extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThread my = new MyThread();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(t1.toString());
    }
}
