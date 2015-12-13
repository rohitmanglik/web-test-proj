package com.rohit.ion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PPP on 2/17/2015.
 */
public class TestTaskScheduler {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(4));
        tasks.add(new Task(2));
        tasks.add(new Task(5));

        /**
         * task with priority 5 has the highest priority and task with priority 2 has lowest priority
         */

        TaskScheduler taskScheduler = new TaskScheduler(tasks);

        taskScheduler.executeAllByPriority();
    }
}
