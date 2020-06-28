package be.cevora.edibles;

public class IceRocket implements Edibles {

    /** Construct a default Ice Rocket */
    public IceRocket(){}

    /** Override for TestAPP */
    @Override
    public String toString() {
        return "IceRocket Consumed";
    }

    @Override
    public void eat() {
    }
}
