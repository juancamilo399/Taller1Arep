package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
}
