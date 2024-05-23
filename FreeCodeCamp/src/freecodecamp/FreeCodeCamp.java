
package freecodecamp;

import java.util.Scanner;


public class FreeCodeCamp {

   
    public static void main(String[] args) {
       String name="Shamima Nasrin";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        
        String string1= new String("abc");
        String string2= new String("abc");
        System.out.println(string1==string2);
        System.out.println(string1.equals(string2));
        
        String string="The sky is red.";
        System.out.println(string.replace("red", "blue"));
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1=scanner.nextLine();
        System.out.printf("Hello %s, how are you?",name1);
        scanner.close();
    }
    
}
