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

    public void delete(double value){
        if(head!=null && head.getValue().equals(value)){
            head=head.getNext();
        }
        else {
            Node current = head;
            Node next = null;
            while((next=current.getNext()) != null){
                if(next.getValue().equals(value)){
                    current.setNext(next.getNext());
                    break;
                }
                current=current.getNext();


            }
        }
    }

    @Override
    public String toString() {
        String string="";
        Node current = head;
        Node next = null;
        while((next=current.getNext()) != null){
            string+=String.valueOf(current.getValue())+" ";
            current=current.getNext();
        }
        string+=String.valueOf(tail.getValue())+" ";
        return string;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
