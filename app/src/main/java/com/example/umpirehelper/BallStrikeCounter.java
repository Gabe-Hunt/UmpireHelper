package com.example.umpirehelper;

/**
 * Represents a ball/strike counter that an umpire would use
 */
public class BallStrikeCounter {
    private int nBalls;
    private int nStrikes;
    private static final int BALLS_FOr_WALK=4;
    private static final int STRIKES_FOR_OUTS=3;


    /**
     * Sets default values for a counter
     */
    public BallStrikeCounter() {
        reset();

    }

    /**
     * Adds one ball to the count
     */
    public void callBall() {
        nBalls++;

        if (nBalls>=BALLS_FOr_WALK) {
            reset();
        }
    }

    /**
     * Adds one strike to the count
     */
    public void callStrike() {
        nStrikes++;

        if (nStrikes>=STRIKES_FOR_OUTS) {
            reset();
        }
    }

    /**
     * Resets values for both balls and strikes
     */
    public void reset() {
        nStrikes=0;
        nBalls=0;
    }

    /**
     * returns current number of balls
     * @return nBalls
     */
    public int getnBalls() {
        return nBalls;
    }

    /**
     * returns current number of strikes
     * @return nStrikes
     */
    public int getnStrikes() {
        return nStrikes;
    }
}
