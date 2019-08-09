package PiggyBank;

public class Nickel extends AbstractMoney {

    private double total;
    private double value = 0.05;
    private String type = "Nickel";
    public Nickel(){
        super();
        total = value;
    }

    public Nickel(int quantity){
        super(quantity);
        total = value * quantity;
        type = "Nickels";
    }

    @Override
    public String getCurrency(){
        return getQuantity() + " " + type;
    }

    public double getTotal(){
        return total;
    }

    public String getValue(){
        return "$" + value;
    }
}