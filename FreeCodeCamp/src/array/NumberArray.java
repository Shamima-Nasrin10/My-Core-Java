package array;

import com.sun.nio.sctp.SctpServerChannel;
import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        System.out.println("\nSum= " + sum+"\n");

//        -------------------------------------------------
//Time-table
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int value = scanner.nextInt();

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d X %d = %d\n", value, multiplier, value * multiplier);
        }
    }
}
