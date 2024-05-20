
package transport;


public class Car extends Vehicle{
    

    @Override
    public void start() {
        System.out.println("Car engine Started.");    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");    }
    
}
