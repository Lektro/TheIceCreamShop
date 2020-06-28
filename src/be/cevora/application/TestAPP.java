package be.cevora.application;
import be.cevora.edibles.*;

import java.util.Arrays;

public class TestAPP {

    public static void main(String[] args) {

        /** test prints */
        Magnum magnum1 = new Magnum(MagnumType.ALPINE_NUTS);
        System.out.println(magnum1.getType());
        magnum1.eat();

        /** test prints */
        IceRocket rocket1 = new IceRocket();
        System.out.println(rocket1);

        /** make new instance of edibles in array */
        Edibles[] dinner1 = new Edibles[]{ magnum1, rocket1 };

        /** test prints */
        System.out.println(dinner1.length);
        System.out.println(Arrays.toString(dinner1));
    }
}

