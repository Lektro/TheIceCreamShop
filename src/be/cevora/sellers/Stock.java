package be.cevora.sellers;

public class Stock {

    /** Class Variables */
    private int iceRocket;
    private int cones;
    private int balls;
    private int magnums;

    /** Constructor */
    public Stock (int iceRocket, int cones, int balls, int magnums) {
        this.iceRocket = iceRocket;
        this.cones = cones;
        this.balls = balls;
        this.magnums = magnums;
    }

    /** auto-generated getter/setter section */
    public int getIceRocket() {

        return iceRocket;
    }

    public void setIceRocket(int iceRocket){

        this.iceRocket = iceRocket;
    }

    public int getCones() {

        return cones;
    }

    public void setCones(int cones) {

        this.cones = cones;
    }

    public int getBalls() {

        return balls;
    }

    public void setBalls(int balls) {

        this.balls = balls;
    }

    public int getMagnums() {

        return magnums;
    }

    public void setMagnums(int magnums) {

        this.magnums = magnums;
    }
}
