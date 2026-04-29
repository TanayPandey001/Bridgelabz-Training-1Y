package com.gla.logistics;

public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dis, int exp, int acc) {
        super(id, loc, dis, exp, acc);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "Rest";
    }

    @Override
    public double Penality() {
        if (!delayedcheck()) {
            return 0;
        }
        int delay = actual_time - expected_time;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}
