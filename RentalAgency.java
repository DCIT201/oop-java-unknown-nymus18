import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle instanceof Rentable) {
            Rentable rentable = (Rentable) vehicle;
            rentable.rent(customer, days);
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (vehicle instanceof Rentable) {
            Rentable rentable = (Rentable) vehicle;
            rentable.returnVehicle();
        }
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }
}