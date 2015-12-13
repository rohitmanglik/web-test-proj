package com.rohit.ion;

import sun.nio.ch.Interruptible;

import java.util.*;

/**
 * Created by PPP on 2/17/2015.
 */
public class TaskScheduler {
    List<Task> tasks;

    TaskScheduler(List<Task> tasks) {
        this.tasks = tasks;
    }

    void executeAllByPriority(){
        Collections.sort(tasks);

        for(Task task: tasks){
            task.execute();
        }
    }


    void executeAllByPriorityWithUninterpretableFirst(){
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                if(!(o1 instanceof Interruptible) && !(o2 instanceof Interruptible)) {
                    return o1.getPriority() - o2.getPriority();
                } else if(!(o1 instanceof Interruptible) && (o2 instanceof Interruptible)) {
                    return 1;
                } else if((o1 instanceof Interruptible) && !(o2 instanceof Interruptible)) {
                    return -1;
                } else  {
                    return o1.getPriority() - o2.getPriority();
                }
            }
        });
    }
}
            /*Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    task.interrupt(Thread.currentThread());
                    System.out.println("Hi");
                }
            });

            if(task.getPriority()==4) {
                t1.start();
            }*/
