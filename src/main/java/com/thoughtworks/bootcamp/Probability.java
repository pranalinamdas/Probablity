package com.thoughtworks.bootcamp;

public class Probability {

    private float probability;

    public Probability(float probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object obj) {
        return this.probability == ((Probability) obj).probability;
    }

    public float calculateEventNotOccur() {
        return 1-probability;
    }

    public float calculateEventsOccur() {
        return 0;
    }
}
