package com.company.pr.hw11;

import java.util.LinkedList;

class LinkedQueue<E> extends AbstractQueue<E> {

    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public E poll() {
        if (queue == null)
            return null;
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
}
