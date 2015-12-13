package com.rohit.ion;

import sun.nio.ch.Interruptible;

import static java.lang.Thread.sleep;

/**
 * Created by PPP on 2/17/2015.
 */
public class Task implements Comparable<Task>, Interruptible {
    private int priority;
    Boolean executing;

    public Task(int priority) {
        this.priority = priority;
        this.executing = false;
    }

    public int getPriority() {
        return priority;
    }

    public void execute() {
        System.out.println("Test"+priority);
        try {
            Thread.sleep((long) (Math.random()*10000));
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            e.printStackTrace();
        }
        executing = true;
    }

    @Override
    public int compareTo(Task task) {
        return task.priority - this.priority;
    }

    @Override
    public void interrupt(Thread thread) {

    }
}