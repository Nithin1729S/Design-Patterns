package VehicleDrive;

public class GoodsVehicle extends Vehicle {
    
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
    
}
