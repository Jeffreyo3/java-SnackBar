package snackBar;

public class Snack {
    private static int maxId = 0;
    public int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    public Snack(String name, int quantity, double cost, int machineId) 
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

        // * get id
    public int getId() {
        return id;
    }

    // * set and get name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // * set and get cost
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    // * set and get vending machine id
    public int getMachineId() {
        return machineId;
    }
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    // * get quantity
    public int getQuantity() {
        return quantity;
    }

    // * add quantity when given how many to add
    public void addQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    // * buy snack when given how many to buy
    public void buyQuantity(int quantity)
    {
        this.quantity = this.quantity - quantity;
    }

    // * get total cost given a quantity
    public double getCost(int quantity)
    {
        return quantity * cost;
    }

}