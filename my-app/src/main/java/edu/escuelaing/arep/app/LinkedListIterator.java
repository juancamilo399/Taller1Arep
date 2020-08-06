package edu.escuelaing.arep.app;

import java.util.Iterator;


public class LinkedListIterator<T> implements Iterator<T> {

    Node<T> current;

    public LinkedListIterator(LinkedList<T> linkedList) {
        current = linkedList.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }

    public void remove() {
    }
}
