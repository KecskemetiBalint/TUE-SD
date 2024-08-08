package pattern.Factory;

public class CarFactory extends VehicleFactory{
    
    @Override 
    Vehicle creatVehicle() {
        return new Car();
    }
}
