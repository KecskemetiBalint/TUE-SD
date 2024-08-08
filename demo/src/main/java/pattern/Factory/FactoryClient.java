package pattern.Factory;

public class FactoryClient {
    public static void run() {
        VehicleFactory carFactory = new CarFactory();
        Owner owner = new Owner(carFactory);
        Vehicle vehicle = owner.getOwnedVehicle();
        vehicle.printVehicle();
    }
}
