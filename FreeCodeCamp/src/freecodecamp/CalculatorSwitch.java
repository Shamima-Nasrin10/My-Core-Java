package freecodecamp;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What operation do you want?");
        String operation = scanner.nextLine();
        switch (operation) {
            case "sum":
                System.out.printf("%f+%f=%f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f-%f=%f", number1, number2, number1 - number2);
                break;
            case "multiply":
                System.out.printf("%f*%f=%f", number1, number2, number1 * number2);
                break;
            case "divide":
                 if(number2==0){
                System.out.println("Cannot divide by zero");
            }
            else{
                  System.out.printf("%f/%f=%f",number1,number2,number1/number2);
            }
               break;
            default:
                System.out.printf("%s is not a supported operation.", operation);

        }
    }

}
