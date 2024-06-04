
package array;

import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {
        char[] vowel={'a','e','i','o','u'};
//        int startIndex=1;
//        int endingIndex=4;
        Arrays.fill(vowel, 1, 4, 'x');
        System.out.println(Arrays.toString(vowel));
    }
}
