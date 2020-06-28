package be.cevora.edibles;

public class Cone implements Edibles {

    /** Class variables */
    private Flavor[] balls;

    /** Construct a default Cone object*/
    public Cone() {}

    /** Construct a Cone object with specified flavor*/
    public Cone(Flavor[] balls) {

        this.balls = balls;
    }

    /** getter for ball Flavor */

    public Flavor[] getBalls() {

        return balls;
    }

    /** Overrides used in TestAPP */
    @Override
    public String toString() {

        return "Cone{" +
                "balls=" + balls +
                '}';
    }

    @Override
    public void eat() {
    }
}
