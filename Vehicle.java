public abstract class Vehicle{
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable){
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable; 

    }
    // Getters and Setters

    public abstract void setAvailability(boolean available);


    public abstract String getVehicleId();

    public abstract void setVehicleId(String vehicleId);

    public abstract String getModel();

    public abstract void setModel(String model);

    public abstract void setBaseRentalRate(double baseRentalRate);

    public abstract double getBaseRentalRate();




    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();


}
