package rideType;

class LuxuryRide implements IRideType {
    @Override
    public double calculateFare(double distance) {

        return distance * 15;
    }
}
