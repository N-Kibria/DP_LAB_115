import PaymentProcess.*;
import Users.*;

import trips.Trip;


public class Main {
    public static void main(String[] args) {


        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new Paypal();
        Driver driver = new Driver("D001", "John Smith", "123 Main St", 4.8, "Car", true);


        Rider rider = new Rider("R1", "John Doe", "123 Street", 5.0, creditCard);

        Trip trip = new Trip();
        rider.makePayment("D001", trip,paypal);


        rider.makePayment("D001", trip, creditCard);
        rider.makePayment("D001", trip, creditCard);

    }
}