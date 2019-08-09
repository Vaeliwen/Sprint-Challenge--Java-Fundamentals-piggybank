package PiggyBank;

public abstract class AbstractMoney {

    private int quantity;

    public AbstractMoney(){
        quantity = 1; }

    public AbstractMoney(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract String getCurrency();
    public abstract double getTotal();

}
