package Notifications;
class InAppNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("In-App Notification: " + message);
    }
}