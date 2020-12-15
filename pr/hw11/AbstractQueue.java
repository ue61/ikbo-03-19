package com.company.pr.hw11;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

abstract class AbstractQueue<E> implements Queue<E> {

    protected List<E> queue;

    @Override
    public E value() {
        E value = peek();
        if (value != null)
            return value;
        throw new NoSuchElementException();
    }

    public boolean add(E value) {
        if (add(value))
            return true;
        throw new IllegalStateException("Очередь заполнена");
    }

    public E remove() {
        E value = poll();
        if (value != null)
            return value;
        throw new NoSuchElementException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection == null)
            throw new NullPointerException();
        boolean isChanged = false;
        for (E value : collection) {
            if (add(value))
                isChanged = true;
        }
        return isChanged;
    }

    public abstract int size();

    @Override
    public String toString() {
        return queue.toString();
    }
}
