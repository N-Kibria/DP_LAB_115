public class milk extends AddCondiment{



    @Override
    public Beverages addCondiment(Beverages b)
    {

        System.out.println("added milk");

        System.out.println("milk"+" :"+ milkcount);
        return b;
    }

    @Override
    public double additionalcost() {
         double  cost =.50*milkcount;
         milkcount++;

        return cost ;
    }


}
