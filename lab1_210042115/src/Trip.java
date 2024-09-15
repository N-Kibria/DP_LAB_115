class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver assignedDriver;
    private PaymentMethod paymentMethod;

    public Trip(RideType rideType, PaymentMethod paymentMethod) {
        this.rideType = rideType;
        this.paymentMethod = paymentMethod;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFare() {
        return fare;
    }

    public void calculateFare() {
        this.fare = rideType.calculateFare(this.distance);
        System.out.println("Fare calculated: " + this.fare);
    }

    public void completeTrip() {
        System.out.println("Trip completed. Fare: " + this.fare);
        paymentMethod.processPayment(this.fare);
    }
}