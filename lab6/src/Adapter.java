
public class Adapter implements INotification {
    private PostalMailService postalMailService;

    public Adapter(PostalMailService postalMailService//Userinfo u)
                    ) {
        this.postalMailService = postalMailService;
        // dependency
    }

    @Override
    public void send(String message, String recipientDetails) {
        //some logic
        String recipientName=null;
        String recipientAddress=null;
        String subject=null;
        String body=null;
        // (String,String,String) = U.get description()
        postalMailService.sendPostalMail( recipientName, recipientAddress,  subject,  body);
    }
}
