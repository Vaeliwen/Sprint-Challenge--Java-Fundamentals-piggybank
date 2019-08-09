package PiggyBank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(m -> System.out.println(m.getCurrency()));

        System.out.println("*** TOTAL ***") ;
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        double grandTotal = piggyBank.stream().mapToDouble(AbstractMoney::getTotal).sum();

        System.out.println("The piggy bank holds " + fp.format(grandTotal));

    }
}
