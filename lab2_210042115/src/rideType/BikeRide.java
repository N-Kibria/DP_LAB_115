package rideType;
class BikeRide implements IRideType {
    @Override
    public double calculateFare(double distance) {

        return distance * 2;
    }
}