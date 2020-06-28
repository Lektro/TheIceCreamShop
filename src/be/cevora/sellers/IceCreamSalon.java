package be.cevora.sellers;

import be.cevora.edibles.*;

public class IceCreamSalon implements IceCreamSeller {

    /** Class variables */
    private PriceList list;
    private Flavor[] flavor;
    private double profit;

    public IceCreamSalon(){}
    public IceCreamSalon(PriceList list) {
        this.list = list;
    }

    /** Place order for new cone */
    @Override
    public Cone orderCone(Flavor[] flavor) {
        Cone newCone = new Cone(flavor);
        this.flavor = flavor;
        profit += list.getBallPrice() * flavor.length;
        return newCone;
    }

    /** Place order for new ice rocket */
    @Override
    public IceRocket orderIceRocket() {
        IceRocket newIceRocket = new IceRocket();
        profit += list.getRocketPrice();
        return newIceRocket;
    }

    /** Place order for new magnum */
    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum newMagnum = new Magnum(type);
        profit += list.getMagnumStandardPrice(type);
        return newMagnum;
    }

    @Override
    public double getProfit() {

        return profit;
    }

    @Override
    public void eat() {
    }
}
