/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author davidson_b
 */
public class SumFinder {
    private Map<Integer, Integer> aHashMap;
    
    public SumFinder(ArrayList<int[]> intArray){
        Iterator<int[]> itr = intArray.iterator();
        aHashMap = new HashMap<>();
        while(itr.hasNext())
            aHashMap.put(itr.next()[0], itr.next()[0]);
    }
    
    private boolean findMatch(Integer sumPartA, int totalSum){
        return (aHashMap.containsKey(totalSum-sumPartA));
    }
    
    public boolean anyMatch(int totalSum){
        Iterator<Entry<Integer,Integer>> itr = aHashMap.entrySet().iterator();
        boolean flag = false;
        while (itr.hasNext() && flag == false){
            flag = findMatch(itr.next().getValue(),totalSum);
        }
        return flag;
    }
}
