public class Phone implements IProduct{
    public void display()
    {

        System.out.println("phone");
    }

    @Override
    public double calculateTotalPrice() {
        return 0;
    }
}
