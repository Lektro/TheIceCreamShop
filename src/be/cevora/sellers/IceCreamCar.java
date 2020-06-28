package be.cevora.sellers;

import be.cevora.application.NoMoreIceCreamException;
import be.cevora.edibles.*;

public class IceCreamCar implements IceCreamSeller {

    /** Class variables */
    private PriceList list;
    private Stock stock;
    private double profit;

    /** default constructor */
    public IceCreamCar() {}

    /** Constructor */
    public IceCreamCar(PriceList list, Stock stock) {

        this.list = list;
        this.stock = stock;
    }

    /** Place order and check stock, had to adjust them later */
    @Override
    public Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException {

        /** check stock and make a new Cone when still available */
        if (stock.getBalls() > 0 && stock.getCones() > 0) {
            Cone newCone = new Cone(flavor);
            profit += list.getBallPrice() * flavor.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavor.length);
            return newCone;

            /** java hard crash not sure how to make better */
        } else throw new NoMoreIceCreamException("Sorry, Ice Cones and or Balls out of stock! Simulation ended");
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {

        /** check stock and make a new one ice rocket when still available */
        if (stock.getIceRocket() > 0) {
            IceRocket newIceRocket = new IceRocket();
            profit += list.getRocketPrice();
            stock.setIceRocket(stock.getIceRocket() - 1);
            return newIceRocket;

            /** java hard crash not sure how to make better */
        } else throw new NoMoreIceCreamException("Sorry,Ice Rockets out of stock! Simulation ended");
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {

        /** check stock and make a new magnum when still available */
        if (stock.getMagnums() > 0) {
            Magnum newMagnum = new Magnum(type);
            profit += list.getMagnumStandardPrice(type);
            stock.setMagnums(stock.getMagnums() - 1);
            return newMagnum;

            /** java hard crash not sure how to make better */
        } else throw new NoMoreIceCreamException("Sorry, Magnums out of stock! Simulation ended");
    }

    /** get profit */
    @Override
    public double getProfit() {

        return profit;
    }

    /** I kinda need it otherwise it doesn't work, not sure what's going on. */
    @Override
    public void eat() {

        System.out.println("We are currently eating ice cream in The Ice Cream Car TM.");
    }
}


