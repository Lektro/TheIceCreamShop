package be.cevora.edibles;

public class IceRocket implements Edibles {

    /** Construct a default Ice Rocket */
    public IceRocket(){}

    /** Override for TestAPP */
    @Override
    public String toString() {

        return "IceRocket Consumed";
    }

    /** Override default eat method */
    @Override
    public void eat() {

        System.out.println("I'm eating an ice rocket");
    }
}
