package javaapplication8;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        try {
            Random number = new Random();
            for (int i = 0; i < 100; i++) {
                myList.add(number.nextInt(101));
            }
            System.out.println(myList);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter index: ");
            int index = scanner.nextInt();
            System.out.println(myList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
        catch(Exception e){
            System.out.println(" "+e);
        }

    }

}
