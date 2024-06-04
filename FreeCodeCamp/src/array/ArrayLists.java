
package array;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(11);
        numbers.add(2);
        numbers.add(32);
        numbers.add(14);
        numbers.add(5);
        
        numbers.set(2, Integer.valueOf(30));
        
        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());
        
        System.out.println("Array: "+numbers.toString());
      
        System.out.println("Value at index 3: "+numbers.get(3));
        System.out.println("Index of 2: "+numbers.indexOf(2));
    }
}
