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

    /** Overrides used in Testing */
    @Override
    public String toString() {

        return "Cone{" +
                "balls=" + balls +
                '}';
    }

    /** Prints out what has been eaten, not sure why it needs to be in sellers package to not break */
    public void eat() {

        System.out.println("I'm eating an ice cone with flavor: " + this.balls);
    }
}
