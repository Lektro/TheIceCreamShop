package be.cevora.edibles;

public class Magnum implements Edibles {

    /** Declaring data types and variables for this class? */
    private MagnumType type;

    /** Construct a default Magnum */
    public Magnum(){}

    /** construct Magnum with certain type of flavor*/
    public Magnum(MagnumType type){

        this.type = type;
    }

    /** getter for MagnumType */
    public MagnumType getType() {

        return type;
    }

    /** Prints out what has been eaten, not sure why it needs to be in sellers package to not break */
    public void eat() {

        System.out.println("I'm eating a Magnum with flavor: " + this.type);
    }
}

