public class Main {
    public static void main(String[] args) {
        INotification emailNotifier = new EmailNotification();
        INotification smsNotifier = new SMSNotification();
        PostalMailService postalMailService = new PostalMailService();
        INotification postalMailNotifier = new Adapter(postalMailService);

        emailNotifier.send("Email!", "user@example.com");
        smsNotifier.send("SMS!", "1234567890");

        String postalDetails = "vbdbdbsfbs";
        postalMailNotifier.send("Send", postalDetails);
    }
}