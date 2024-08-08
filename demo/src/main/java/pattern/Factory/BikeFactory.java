package pattern.Factory;

public class BikeFactory extends VehicleFactory{
    
    @Override
    Vehicle creatVehicle() {
        return new Bike();
    }
}
