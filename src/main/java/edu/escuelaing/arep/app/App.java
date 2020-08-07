package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

/**
 * App Class
 * @author Juan Camilo Angel h
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
        System.out.println("Standard Deviation" + String.valueOf(standarDev1));
    }

    /**
     * Creates a linkedlist given its values in an text file
     * @param testCasePath The path of the file that contain the values
     * @return  A LinkedList with te values provided
     * @throws Exception
     */
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

    /**
     * Calculates the mean of the values stored in an LinkedList
     * @param linkedList The linkedlist with the values
     * @return The mean of the values stored in an LinkedList
     */
    public static Double mean(LinkedList<Double> linkedList) {
        Double sum = 0.0;
        for(Double value:linkedList){
            sum+=value;
        }
        Double ans = (sum / linkedList.getSize());
        return ans;
    }

    /**
     * Calculates the standard deviation of the values stored in an LinkedList
     * @param linkedList The linkedlist with the values
     * @return The standard deviation of the values stored in an LinkedList
     */
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
