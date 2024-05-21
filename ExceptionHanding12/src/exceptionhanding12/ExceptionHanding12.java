
package exceptionhanding12;

import java.util.Scanner;


public class ExceptionHanding12 {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1=scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2=scanner.nextInt();
        int result= quotient(number1, number2);
        System.out.println(result);
    }
    
    public static int quotient(int number1, int number2){
        if(number2==0){
            System.out.println("Divisor cannot be zero.");
            System.exit(1);
        }
        return number1/number2;
    }
    
}
