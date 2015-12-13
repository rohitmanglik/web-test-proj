package com.rohit;

import java.util.Hashtable;

/**
 * Created by PPP on 1/3/2015.
 */
public class MyThread extends Thread {
    private volatile boolean running = true;
    Hashtable<Integer, Integer> hash = new Hashtable<>();

    public void run() {
        for (int i = 0; i < 100000; i++) {
            int j = (int) (Thread.currentThread().getId() * 100000 + i);
            hash.put(j, i);
            hash.remove(j);
        }
        System.out.println(hash.size());
    }



    public String toString() {
        System.out.println("I am called"+hash.size());
        return "Count is "+ hash.size();
    }

/*
        while(running){
            System.out.println("Running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
*/

    public void shutdown(){
        running = false;
    }

}



