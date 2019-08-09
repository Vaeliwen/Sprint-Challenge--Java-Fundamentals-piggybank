package PiggyBank;

public class Dime extends AbstractMoney {

    private double total;
    private double value = 0.10;
    private String type = "Dime";

    public Dime(){
        super();
        total = value;
    }

    public Dime(int quantity){
        super(quantity);
        total = value * quantity;
        type = "Dimes";
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
