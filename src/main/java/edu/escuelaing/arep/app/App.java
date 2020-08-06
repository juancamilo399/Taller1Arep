package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        LinkedList<Double> myLinkedList = null;
        try {
            myLinkedList = makeLinkedList("resources\\examples.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Double value : myLinkedList) {
            System.out.println(value);
        }

        Double mean = mean(myLinkedList);
        System.out.println("Mean: " + String.valueOf(mean));
        Double standarDev1 = standardDeviation(myLinkedList);
        System.out.println("Standard Deviation Test Case 1: " + String.valueOf(standarDev1));
    }

    public static LinkedList<Double> makeLinkedList(String testCasePath) throws Exception {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        File file = new File(testCasePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Double value;
        String string;
        string = bufferedReader.readLine();
        while( string != null){
            value = Double.parseDouble(string);
            myLinkedList.add(value);
            string = bufferedReader.readLine();
        }
        return myLinkedList;
    }

    public static Double mean(LinkedList<Double> linkedList) {
        Double sum = 0.0;
        for(Double value:linkedList){
            sum+=value;
        }
        Double ans = (sum / linkedList.getSize());
        return ans;
    }

    public static Double standardDeviation(LinkedList<Double> linkedList){
        Double mean = mean(linkedList);
        Double sum = 0.0;
        Double x;
        for (Double value:linkedList){
            x=value-mean;
            sum+=x*x;
        }
        Double ans = Math.sqrt(sum/(linkedList.getSize()-1));

        return (double)Math.round(ans * 100d) / 100d;
    }
}
