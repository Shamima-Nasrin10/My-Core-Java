
package exceptionhanding12;


public class Test125 {
    public static void main(String[] args) {
        int num=50;
        try {
            if(num<40){
            throw new Exception ("Value is too small.");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continue after the catch block.");
    }
}
