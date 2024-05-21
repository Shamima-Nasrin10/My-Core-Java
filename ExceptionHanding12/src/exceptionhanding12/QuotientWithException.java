
package exceptionhanding12;

import java.util.Scanner;


public class QuotientWithException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2=scanner.nextInt();
        try {
            int result=quotientWithException(num1, num2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(" "+e);
        }
        System.out.println("Execution continues....");
        
        try {
            long value=Long.MAX_VALUE+1;
        System.out.println(value);
        } catch (Exception e) {
            System.out.println(" "+e);
        }
        
        
        
    }
    
    public static int quotientWithException(int num1, int num2){
        if(num2==0){
           throw new ArithmeticException("Divisor cannot be zero.");
        }
        return num1/num2;
    }
}
