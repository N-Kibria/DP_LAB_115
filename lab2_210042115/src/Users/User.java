package Users;
abstract class User {
    protected String id;
    protected String name;
    protected String location;
    protected double rating;

    public User(String id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }


    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println(name + " updated location to: " + newLocation);
    }


    public abstract void rateUser(String userId, String tripId);
}