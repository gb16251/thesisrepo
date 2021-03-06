package infoextraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabriela on 26-Jul-17.
 */

//Used for evaluation
// calculates the averages for individual parameter values
public class averageCalculator {
    private int[] sums = new int[101];
    private int[] values = new int[101];
    private int[]  results= new int[101];

    public int[] getResults() {
        getSums();
        return results;
    }

    public void addItem(int index, int addThis){
        values[index]++;
        sums[index] += addThis;
    }

    public void getSums(){
        for (int i= 0; i<=100; i++) {
            try {
                results[i] = (int) (sums[i] / values[i]);
            }
            catch (Exception e ) {System.err.println("Could not divide by 0");}
        }
    }

    public void printResults(){
        for (int i:results){
            System.out.print(results[i]);
        }
        System.out.println();
    }
}
