package be.cevora.application;

import be.cevora.edibles.Edibles;
import be.cevora.edibles.Flavor;
import be.cevora.edibles.MagnumType;
import be.cevora.sellers.IceCreamSalon;
import be.cevora.sellers.IceCreamSeller;
import be.cevora.sellers.PriceList;

import java.util.ArrayList;

public class IceCreamAppV1 {
    public static void main(String[] args) throws NoMoreIceCreamException {

        /** Create new instance of price list */
        PriceList priceList = new PriceList(1.2, 0.7, 1.90);

        /** Create a new instance of the ice cream seller */
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);

        /** Create a new Arraylist of Edibles */
        ArrayList<Edibles> order1 = new ArrayList<>();

        /** order custom ice creams */
        order1.add(iceCreamSalon.orderIceRocket());
        order1.add(iceCreamSalon.orderMagnum(MagnumType.ROMANTIC_STRAWBERRIES));
        order1.add(iceCreamSalon.orderCone(new Flavor[]{Flavor.BANANA}));

        /** Invoke eat method on Array List of the order of the current vendor */
        iceCreamSalon.eat();

        /** Get profit and print to terminal */
        System.out.println("The total profit of the simulated order: " +iceCreamSalon.getProfit());
    }
}
