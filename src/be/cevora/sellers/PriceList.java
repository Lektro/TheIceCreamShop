package be.cevora.sellers;

import be.cevora.edibles.Edibles;
import be.cevora.edibles.MagnumType;

public class PriceList implements Edibles {

    /** Class variables */
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;
    private double magnumDeviatedPrice;
    private MagnumType type; // variable for switch case set magnum price method

    /** Construct default Price list object to prevent errors */
    public PriceList() {
    }

    /** Construct Price list object with pre defined value's */
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
        this.magnumDeviatedPrice = magnumStandardPrice;
    }

    /** get ball price */
    public double getBallPrice() {

        return ballPrice;
    }

    /** set ball price */
    public void setBallPrice(double ballPrice) {

        this.ballPrice = ballPrice;
    }

    /** get rocket price */
    public double getRocketPrice() {

        return rocketPrice;
    }

    /** set rocket price */
    public void setRocketPrice(double rocketPrice) {

        this.rocketPrice = rocketPrice;
    }

    /** get magnum standard price price */
    public double getMagnumStandardPrice(MagnumType type) {

        return magnumStandardPrice;
    }

    /** set a new price for magnum deviated price with case switch */
    public void setMagnumStandardPrice(double magnumDeviatedPrice) {
        switch (type){

            /** add price variety here */
            case ALPINE_NUTS: magnumStandardPrice *= 1.5;
        }
        /** sets the magnumStandardPrice to the deviated price */
        this.magnumStandardPrice = magnumDeviatedPrice;
        }

        /** really not sure what's happening anymore lol */
        @Override
        public void eat() {
    }
}

