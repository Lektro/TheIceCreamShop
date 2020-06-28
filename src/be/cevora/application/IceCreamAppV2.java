package be.cevora.application;

import be.cevora.edibles.Edibles;
import be.cevora.edibles.Flavor;
import be.cevora.edibles.MagnumType;
import be.cevora.sellers.*;

import java.util.ArrayList;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {

        /** Create new instance of a simulated price list */
        PriceList priceList = new PriceList(1.0, 0.80, 2.50);

        /** Create simulated limited stock */
        Stock stockIceCreamCar = new Stock(5, 10, 25, 7);

        /** Create a new instance of the ice cream seller */
        IceCreamSeller edibles = new IceCreamCar(priceList, stockIceCreamCar);

        /** Create a new Arraylist of Edibles */
        ArrayList<Edibles> order2 = new ArrayList<>();

        /** Order custom ice creams */
        order2.add(edibles.orderIceRocket());
        order2.add(edibles.orderMagnum(MagnumType.ROMANTIC_STRAWBERRIES));
        order2.add(edibles.orderCone(new Flavor[]{Flavor.BANANA}));
        order2.add(edibles.orderIceRocket());
        order2.add(edibles.orderMagnum(MagnumType.ALPINE_NUTS));
        order2.add(edibles.orderCone(new Flavor[]{Flavor.MOKKA}));
        order2.add(edibles.orderIceRocket());

        /** Uncomment the next block comment and order more ice rockets to see the exception handling */

        /*
        order2.add(edibles.orderIceRocket());
        order2.add(edibles.orderIceRocket());
        order2.add(edibles.orderIceRocket());
        */

        /** Invoke eat method on Array List of current Ice Cream Order with overloaded methods from Edibles */
        edibles.eat();

        /** Get profit and print to terminal */
        System.out.println("The total profit of this simulated order: " + edibles.getProfit() + " EUR");
    }
}
