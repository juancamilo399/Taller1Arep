package edu.escuelaing.arep.app;


public class Node<T> {

    private Node<T> next, prior;
    private T value;

    public Node(T value, Node<T> prior, Node<T> next) {
        this.value = value;
        this.next = next;
        this.prior = prior;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrior() {
        return prior;
    }

    public void setPrior(Node<T> prior) {
        this.prior = prior;
    }

}
