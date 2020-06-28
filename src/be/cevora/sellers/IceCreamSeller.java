package be.cevora.sellers;

import be.cevora.application.NoMoreIceCreamException;
import be.cevora.edibles.*;

public interface IceCreamSeller extends Profitable {
    /** Class variable */
    double getProfit();

    /** order custom ice cream */
    Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException;
}
