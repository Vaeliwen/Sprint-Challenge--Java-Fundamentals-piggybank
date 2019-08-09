package PiggyBank;

public class Quarter extends AbstractMoney {

    private double total;
    private double value = 0.25;
    private String type = "Quarter";

    public Quarter(){
        super();
        total = value;
    }

    public Quarter(int quantity){
        super(quantity);
        total = value * quantity;
        type = "Quarters";
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

