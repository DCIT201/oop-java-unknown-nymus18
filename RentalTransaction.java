import java.time.LocalDate;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, LocalDate rentalDate, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.rentalDays = rentalDays;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }
}