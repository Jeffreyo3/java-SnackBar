package snackBar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }


    // * get id
    public int getId()
    {
        return id;
    }

    // * set and get name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // * add cash to cash on hand
    public void addCash(double cash)
    {
        this.cash = this.cash + cash;
    }

    // * get cash on hand
    public double getCash()
    {
        return cash;
    }

    // * buy snacks. Given the total cost of the snacks to be purchased, 
    //                           reduce the cash on hand by that amount
    public void buySnacks(int quantity, Snack snack)
    {
        snack.buyQuantity(quantity);
        this.cash = this.cash - snack.getCost(quantity);
    }
}