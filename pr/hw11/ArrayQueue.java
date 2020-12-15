package com.company.pr.hw11;

import java.util.ArrayList;

class ArrayQueue<E> extends AbstractQueue<E> {

    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public E poll() {
        if (queue == null) return null;
        E value = queue.get(0);
        queue.remove(0);
        return value;
    }

    @Override
    public E peek() {
        if (queue != null) return queue.get(0);
        return null;
    }

    @Override
    public boolean add(E value) {
        return queue.add(value);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
