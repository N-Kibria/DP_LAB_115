import java.util.*;
class Admin {
    private String id;
    private String name;
    private String role;

    private List<Driver> drivers = new ArrayList<>();
    private List<Rider> riders = new ArrayList<>();
    private List<Trip> trips = new ArrayList<>();

    public void handleDispute(Driver d, Rider r, Trip t) {

    }

    public void viewHistory(String tripId) {

    }

    public List<Driver> getDriverList() {
        return drivers;
    }

    public List<Rider> getRiderList() {
        return riders;
    }

    public List<Trip> getTripList() {
        return trips;
    }
}