
package arrayindex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        int[] arrayList=new int[100];
        Random random=new Random();
        for(int i=0; i<arrayList.length; i++){
            arrayList[i]=random.nextInt(50);
        }
        System.out.println("My Array: "+Arrays.toString(arrayList));
        
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter any index: ");
            int index=scanner.nextInt();
            System.out.println(arrayList[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        } catch(Exception e){
            System.out.println(" "+e.getMessage());
        }
    }
}
