package edu.escuelaing.arep.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();

        myLinkedList.add(1.0);
        myLinkedList.add(2.0);
        myLinkedList.add(3.0);

        for (Double value : myLinkedList)
            System.out.println(value);
    }
}
