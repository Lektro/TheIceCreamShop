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

    /** Overrides for testing with TestAPP */
    @Override
    public String toString() {

        return "Magnum{" +
                "type=" + type +
                '}';
    }

    /** Overrides for testing with TestAPP */
    @Override
    public void eat() {

        System.out.println("I'm eating an ice cream with flavor: " + this.type);
    }
}

