package snackBar;

public class Main {

    public static void main(String[] args) {
        // Instantiate 2 customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Instantiate 3 Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        
        // Instantiate 5 snacks
        // Vending Machine Food
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        // Vending Machine Drink
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
        
        System.out.println("\n\n *** MVP *** \n\n");

        jane.buySnacks(3, soda);
        System.out.println(jane.getName() + "'s cash on hand: $" + jane.getCash());
        System.out.println("Quantity of " + soda.getName() + " is: " + soda.getQuantity());
        
        System.out.println();
        
        jane.buySnacks(1, pretzel);
        System.out.println(jane.getName() + "'s cash on hand: $" + jane.getCash());
        System.out.println("Quantity of " + pretzel.getName() + " is: " + pretzel.getQuantity());
        
        System.out.println();

        bob.buySnacks(2, soda);
        System.out.println(bob.getName() + "'s cash on hand: $" + bob.getCash());
        System.out.println("Quantity of " + soda.getName() + " is: " + soda.getQuantity());

        System.out.println();
        
        jane.addCash(10);
        System.out.println(jane.getName() + " has $" + jane.getCash() + " on hand");

        System.out.println();

        jane.buySnacks(1, chocolate);
        System.out.println(jane.getName() + "'s cash on hand: $" + jane.getCash());
        System.out.println("Quantity of " + chocolate.getName() + " is: " + chocolate.getQuantity());

        pretzel.addQuantity(12);

        System.out.println();

        System.out.println("Quantity of " + pretzel.getName() + " is: " + pretzel.getQuantity());

        System.out.println();

        bob.buySnacks(3, pretzel);
        System.out.println(bob.getName() + "'s cash on hand: $" + bob.getCash());
        System.out.println("Quantity of " + pretzel.getName() + " is: " + pretzel.getQuantity());

        System.out.println("\n\n *** STRETCH *** \n\n");

        System.out.println("Snack: " + chips.getName()  + "\nVending Machine: " + chips.getMachineId() + "\nQuantity: " + chips.getQuantity() + "\nTotal Cost: " + chips.getCost(chips.getQuantity()));

        System.out.println();

        System.out.println("Snack: " + chocolate.getName()  + "\nVending Machine: " + chocolate.getMachineId() + "\nQuantity: " + chocolate.getQuantity() + "\nTotal Cost: " + chocolate.getCost(chocolate.getQuantity()));

        System.out.println();

        System.out.println("Snack: " + pretzel.getName()  + "\nVending Machine: " + pretzel.getMachineId() + "\nQuantity: " + pretzel.getQuantity() + "\nTotal Cost: " + pretzel.getCost(pretzel.getQuantity()));

        System.out.println();

        System.out.println("Snack: " + soda.getName()  + "\nVending Machine: " + soda.getMachineId() + "\nQuantity: " + soda.getQuantity() + "\nTotal Cost: " + soda.getCost(soda.getQuantity()));

        System.out.println();

        System.out.println("Snack: " + water.getName()  + "\nVending Machine: " + water.getMachineId() + "\nQuantity: " + water.getQuantity() + "\nTotal Cost: " + water.getCost(water.getQuantity()));
    }
}