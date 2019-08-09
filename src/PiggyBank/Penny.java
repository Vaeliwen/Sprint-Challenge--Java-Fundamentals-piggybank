package PiggyBank;

public class Penny extends AbstractMoney {

    private double total;
    private double value = 0.01;
    private String type = "Penny";

    public Penny(){
        super();
        total = value;
    }

    public Penny(int quantity){
        super(quantity);
        total = value * quantity;
        type = "Pennies";
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
