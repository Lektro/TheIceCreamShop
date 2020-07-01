package be.cevora.sellers;

import be.cevora.edibles.Edibles;

// Profitable extend niet van Edibles

public interface Profitable extends Edibles {

    /** Class variable*/
    double getProfit();

    @Override
    void eat();
}
