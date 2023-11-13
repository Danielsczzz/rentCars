package Model;

public class Car extends Vehicle {

    private static final double BASE_PRICE_CAR = 100;
    private static final double ROAD_KIT_TAX_PRICE = 25;
    private static final double LEAVE_TOWN_TAX_PRICE = 50;

    public Car() {
    }

    public Car(int id, String licensePlate, int model, String vehicleBrand, String description, int mileage, String type) {
        super(id, licensePlate, model, vehicleBrand, description, mileage, type);
    }

    public static double getCarValue(int model, boolean roadKit, boolean leaveTown) {
        double vehicleValue = Car.BASE_PRICE_CAR;
        vehicleValue = (roadKit) ? vehicleValue + Car.ROAD_KIT_TAX_PRICE : vehicleValue;
        vehicleValue = (leaveTown) ? vehicleValue + Car.LEAVE_TOWN_TAX_PRICE : vehicleValue;
        vehicleValue = (model < 2000) ? vehicleValue + 10 : vehicleValue;
        vehicleValue = (model < 2010) ? vehicleValue + 20 : vehicleValue;
        vehicleValue = (model <= 2020) ? vehicleValue + 30 : vehicleValue;
        vehicleValue = (model > 2020) ? vehicleValue + 40 : vehicleValue;
        return vehicleValue;
    }

}
