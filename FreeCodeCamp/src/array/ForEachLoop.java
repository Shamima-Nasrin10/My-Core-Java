package array;

import java.util.Arrays;
import java.util.Random;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt(10);
        }
        System.out.println("Array: "+Arrays.toString(numbers));
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("Sum= "+sum);
    }

}
