package pattern.Factory;

public class Owner {
    private Vehicle ownedVehicle;

    public Owner(VehicleFactory factory) {
        this.ownedVehicle = factory.creatVehicle();
    }
    public Vehicle getOwnedVehicle() {
        return this.ownedVehicle;
    }
}
