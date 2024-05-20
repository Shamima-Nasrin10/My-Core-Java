
package transport;


public class Transport {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
        car.stop();
        System.out.println(car);
        
        Vehicle motocycle= new Motorcycle();
        motocycle.start();
        motocycle.stop();
        System.out.println(motocycle);
        
    }
         
}
