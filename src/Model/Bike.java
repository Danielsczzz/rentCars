package Model;

public class Bike extends Vehicle {

    private static final double BASE_PRICE_BIKE = 75;
    private static final double HELMET_TAX_PRICE = 25;
    private static final double INSURANCE_TAX_PRICE = 50;

    public Bike() {
    }

    public Bike(int id, String licensePlate, int model, String vehicleBrand, String description, int mileage, String type) {
        super(id, licensePlate, model, vehicleBrand, description, mileage, type);
    }

    public static double getBikeValue(int model, boolean rentHelmet, boolean leaveTown) {
        double vehicleValue = Bike.BASE_PRICE_BIKE;
        vehicleValue = (rentHelmet) ? vehicleValue + Bike.HELMET_TAX_PRICE : vehicleValue;
        vehicleValue = (leaveTown) ? vehicleValue + Bike.INSURANCE_TAX_PRICE : vehicleValue;
        vehicleValue = (model < 2000) ? vehicleValue + 10 : vehicleValue;
        vehicleValue = (model < 2010) ? vehicleValue + 20 : vehicleValue;
        vehicleValue = (model <= 2020) ? vehicleValue + 30 : vehicleValue;
        vehicleValue = (model > 2020) ? vehicleValue + 40 : vehicleValue;
        return vehicleValue;
    }

}
