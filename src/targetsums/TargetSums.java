/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidson_b
 */
public class TargetSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<int[]> intArray;
        try {
            intArray = FileArrayProvider.readLines("C:/HashInt.txt");
        } 
        catch (IOException ex) {
            Logger.getLogger(TargetSums.class.getName()).log(Level.SEVERE, null, ex);
            intArray = null;
        }
        SumFinder aSummer = new SumFinder(intArray);
        int[] tests = {231552, 234756, 596873, 648219, 726312, 981237, 988331, 1277361, 1283379};
        for (int i = 0 ; i < tests.length; i ++){
            boolean answer = aSummer.anyMatch(tests[i]);
            System.out.print(answer);
            System.out.print("\t");
            System.out.print(tests[i]);
            System.out.print("\n");
        } 
}
}
