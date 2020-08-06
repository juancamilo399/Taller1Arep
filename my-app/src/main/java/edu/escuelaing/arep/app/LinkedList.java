package edu.escuelaing.arep.app;


import java.util.Iterator;


public class LinkedList<T> implements Iterable<T> {

    Node<T> head, tail;

    public Node<T> getHead(){
        return head;
    }

    public Node<T> getTail(){
        return tail;
    }

    public void add(T data) {
        Node<T> new_node = new Node<T>(data, null, null);
        if (head==null) {
            head= tail=new_node;
        } else {
            new_node.setPrior(tail);
            tail.setNext(new_node);
            tail = new_node;
        }

    }

    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
