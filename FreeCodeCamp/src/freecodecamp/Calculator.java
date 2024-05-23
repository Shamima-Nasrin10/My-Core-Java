package freecodecamp;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What operation do you want?");
        String operation=scanner.nextLine();
        
        if(operation.equals("sum")){
            System.out.printf("%f+%f=%f",number1,number2, number1+number2);
        }
        else if(operation.equals("sub")){
            System.out.printf("%f-%f=%f",number1,number2,number1-number2);
        }
        else if(operation.equals("multiply")){
            System.out.printf("%fX%f=%f",number1,number2,number1*number2);
        }
        else if(operation.equals("divide")){
            if(number2==0){
                System.out.println("Cannot divide by zero");
            }
            else{
                  System.out.printf("%f/%f=%f",number1,number2,number1/number2);
            }
          
        }
        else{
            System.out.printf("%s is not a supported operation",operation);
        }
        scanner.close();
    }

}
