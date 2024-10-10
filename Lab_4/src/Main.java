import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory f = new Factory();


        System.out.println("Choose a base beverage:");
        System.out.println("1. Espresso ($1.99) \n2. Latte ($3.99)\n3. Cappuccino ($2.99)");
        int baseChoice = sc.nextInt();


        Beverages b = f.createBeverage(baseChoice);


        if (b == null) {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        int condimentChoice;
        do {

            System.out.println("Choose a condiment (1: Milk ($.50), 2: Whipped Cream($.60), 3: White Sugar($20), 0 to stop):");
            condimentChoice = sc.nextInt();
            AddCondiment condiment = f.Addcondiment(condimentChoice);
            if (condimentChoice != 0) {
                b = f.addCondiment(b, condimentChoice);
                System.out.println("Total cost: $" + f.cost( b, condiment));
            }
        } while (condimentChoice != 0);



    }
}
