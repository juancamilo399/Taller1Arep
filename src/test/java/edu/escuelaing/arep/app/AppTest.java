package edu.escuelaing.arep.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Unit tests for app
 */
public class AppTest

{
    @Test
    public void shouldAdd()
    {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        Double[] values={1.0,2.0,3.0,4.0};
        boolean flag=false;
        for (Double value:values) {
            myLinkedList.add(value);
            flag=(myLinkedList.tail.getValue()==value);
        }
        assertTrue(flag);
    }

    @Test
    public void shouldDelete()
    {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        Double[] values={1.0,2.0,3.0,4.0};
        for (Double value:values) myLinkedList.add(value);
        myLinkedList.delete(2.0);
        assertEquals("1.0 3.0 4.0 ", myLinkedList.toString());
    }

    @Test
    public void shouldReadAndAdd() throws Exception {
        LinkedList<Double> myLinkedList = null;
        myLinkedList=App.makeLinkedList("resources\\examples.txt");
        assertTrue(myLinkedList.head.getValue()==160.0 && myLinkedList.tail.getValue()==1503);
    }

    @Test
    public void testMeanAndStandardDeviation() throws Exception {
        LinkedList<Double> myLinkedList = null;
        myLinkedList=App.makeLinkedList("resources\\examples.txt");
        Double mean=App.mean(myLinkedList);
        Double standard_deviation=App.standardDeviation(myLinkedList);
        assertEquals(550.6,mean,0.001);
        assertEquals(572.03,standard_deviation,0.001);
    }

    @Test
    public void test2MeanAndStandardDeviation() throws Exception {
        LinkedList<Double> myLinkedList = null;
        myLinkedList=App.makeLinkedList("resources\\examples2.txt");
        Double mean=App.mean(myLinkedList);
        Double standard_deviation=App.standardDeviation(myLinkedList);
        assertEquals(60.32,mean,0.001);
        assertEquals(62.26,standard_deviation,0.001);
    }


}
