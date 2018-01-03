/**
 * Created by winniejeng on 3/27/17.
 */

import java.util.ArrayList;

public class CashRegisterDemo {

    public static void main (String[] args){

        ArrayList<Double> storePrices = new ArrayList<>();
        CashRegister object = new CashRegister();

        object.addItem(5.30);
        object.addItem(4.70);
        object.addItem(34);
        object.clear();
        object.addItem(34);
        object.clear();
        System.out.println(object.getCount());
        System.out.println(object.getTotal());

    }
}
