
package trips;

import Users.*;

public class Trip implements rideType.IRideType,PaymentProcess.PaymentMethod {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;

    private String status;
    private double fare;
    private double distance;
    private IRideType R;


    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void processPayment(double amount)
    {

    }
    public double getFare() {
        return calculateFare(distance);
    }

    @Override
    public double calculateFare(double distance) {

         return distance * 5;
    }

    public void completeTrip(Driver d,Rider r) {
        //logic
        System.out.println("Trip completed. Fare: " + this.fare);

    }
}
