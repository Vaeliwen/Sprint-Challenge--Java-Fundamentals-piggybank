package PiggyBank;

public class Dollar extends AbstractMoney {

    private double total;
    private double value = 1.00;
    private String type = "Dollar";
    public Dollar(){
        super();
        total = value;
    }

    public Dollar(int quantity){
        super(quantity);
        total = value * quantity;
        type = "Dollars";
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

