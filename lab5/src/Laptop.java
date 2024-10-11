public class Laptop implements IProduct {


    public void display() {

        System.out.println("Laptop");
    }

    @Override
    public double calculateTotalPrice() {
        return 70000;
    }
}
