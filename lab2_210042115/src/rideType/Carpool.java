package rideType;
class Carpool implements IRideType {
    @Override
    public double calculateFare(double distance) {

        return distance * 5;
    }
}