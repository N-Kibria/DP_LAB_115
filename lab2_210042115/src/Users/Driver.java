package Users;
public class Driver extends User {
    private String vehicleType;
    private boolean availability;

    public Driver(String driverId, String name, String location, double rating, String vehicleType, boolean availability) {
        super(driverId, name, location, rating);
        this.vehicleType = vehicleType;
        this.availability = availability;
    }

    public boolean acceptRide(String riderId) {

        return true;
    }

    @Override
    public void rateUser(String riderId, String tripId) {

        System.out.println(name + " rated rider " + riderId + " for trip " + tripId);
    }

    public void startTrip(Rider r) {

    }
}