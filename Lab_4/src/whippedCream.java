public class whippedCream extends AddCondiment{

    @Override
    public Beverages addCondiment(Beverages b) {


            System.out.println("added Whipped cream");
            System.out.println("Whipped Cream"+" :"+ Creamcount);

        return b;
    }

    @Override
    public double additionalcost() {
        double  cost =.60*Creamcount;
        Creamcount++;

        return cost ;

    }

}
