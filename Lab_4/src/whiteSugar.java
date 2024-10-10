public class whiteSugar extends AddCondiment{

    @Override
    public Beverages addCondiment(Beverages b) {

        System.out.println("added White Sugar");
        System.out.println("White sugar"+" :"+ Sugercount);
        return b;
    }

    @Override
    public double additionalcost() {
        double  cost =.20*Sugercount;
        Sugercount++;

        return cost ;
    }


}
