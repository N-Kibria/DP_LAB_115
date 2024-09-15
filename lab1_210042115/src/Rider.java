class Rider extends User {
    private PaymentMethod preferredPaymentMethod;

    public Rider(String riderId, String name, String location, double rating, PaymentMethod preferredPaymentMethod) {
        super(riderId, name, location, rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void requestRide(String pickup, String dropoff) {

    }

    @Override
    public void rateUser(String driverId, String tripId) {

    }

    public void makePayment(String driverId, Trip t) {

        preferredPaymentMethod.processPayment(t.getFare());
    }
}