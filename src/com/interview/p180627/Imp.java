package com.interview.p180627;

import java.util.LinkedList;
import java.util.Queue;

public class Imp implements Datastructure{
    Queue<Integer> queue;

    public Imp() {
        this.queue = new LinkedList<>();
    }

    @Override
    public Integer getAvg() {
        return null;
    }

    @Override
    public void add(Integer element) {
        queue.add(element);
    }
}
