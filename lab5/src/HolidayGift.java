

public class HolidayGift extends Bundle{
    public void display()
    {
        name="holidayGift";
        System.out.println(name);
    }
    @Override
    public void CreateBundle()
    {
        components.add(new Laptop());
        components.add(new Phone());
        System.out.println("Laptop and phone bundle");
    }
}
