package array;

import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        System.out.println(Arrays.toString(vowels));

        char vowel[] = {'a', 'e', 'i', 'o', 'u'};
        vowel[2] = 'x';
        System.out.println(Arrays.toString(vowel));

        char vwel[] = {'e', 'o', 'i', 'a', 'u'};
        //Arrays.sort(vwel);
        //System.out.println(Arrays.toString(vwel));
        int startIndex = 1;
        int endIndex = 4;
        Arrays.sort(vwel, startIndex, endIndex);
        System.out.println(Arrays.toString(vwel));

        char letter[] = {'e', 'g', 'a', 't', 's', 'e'};
        Arrays.sort(letter);
        char key = 't';
        int foundItemIndex = Arrays.binarySearch(letter, key);
        System.out.println(Arrays.toString(letter));
        System.out.println(foundItemIndex);
    }
}
