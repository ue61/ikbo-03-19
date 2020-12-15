package com.company.pr.hw11;

interface Queue<E> {
    E value();
    E poll();
    E peek();
    boolean add(E value);
}
