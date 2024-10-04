import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory f = new Factory();

        // Prompt user to choose a beverage
        System.out.println("Choose a base beverage:");
        System.out.println("1. Espresso\n2. Latte\n3. Capuccino");
        int baseChoice = sc.nextInt();

        Beverages b ;
        int c=0;


        if (baseChoice == 1) {
            b = new Espresso();
        } else if (baseChoice == 2) {
            b = new Latte();
        } else if (baseChoice == 3) {
            b = new Capuccino();
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        int condimentChoice;
        do {

            System.out.println("Choose a condiment (1: Milk, 2: Whipped Cream, 3: White Sugar, 0 to stop):");
            condimentChoice = sc.nextInt();

            if (condimentChoice != 0) {
                c++;
                b = f.addCondiment(b, condimentChoice);

            }
        } while (condimentChoice != 0);

        System.out.println("Total cost: $" + b.cost());
    }
}
