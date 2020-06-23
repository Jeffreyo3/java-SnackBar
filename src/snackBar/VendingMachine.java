package snackBar;

public class VendingMachine {
    private static int maxId = 0;
	private int id;
	private String name;

    public VendingMachine(String name) 
    {
		maxId++;
		id = maxId;
		this.name = name;
    }
    
    // * get id
    public int getId() {
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
}