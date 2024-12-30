public class Car extends Vehicle implements Rentable{
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable){
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public void setVehicleId(String vehicleId) {
        if(vehicleId.length() >0){
            this.vehicleId = vehicleId; 
        }
    }

    @Override
    public String getVehicleId() {
        return this.vehicleId;
    }

    @Override
    public void setModel(String model) {
        if(model.length()>0){

            this.model = model;
        }
    }

    @Override
    public String getModel() {
        return model;
    }
    
    @Override
    public void setBaseRentalRate(double baseRentalRate) {
        if(baseRentalRate>0){
            this.baseRentalRate = baseRentalRate;
        }
    }

    @Override
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    
    @Override
    public boolean isAvailableForRental() {
        return isAvailable;
    }

    @Override
    public void setAvailability(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = days * this.baseRentalRate;
        return cost; 
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental() && days > 0) {
            setAvailability(false);
            // setDays(days);
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Car returned.");
    }
}
