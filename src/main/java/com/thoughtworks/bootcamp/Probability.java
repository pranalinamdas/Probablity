package com.thoughtworks.bootcamp;

public class Probability {

    private float probability;
    private float probabilityOfFirstEvent;
    private float probabilityOfSecondEvent;

    public Probability(float probability) {
        this.probability = probability;
    }

    public Probability(float probabilityOfFirstEvent, float probabilityOfSecondEvent){
        this.probabilityOfFirstEvent = probabilityOfFirstEvent;
        this.probabilityOfSecondEvent = probabilityOfSecondEvent;
    }

    @Override
    public boolean equals(Object obj) {
        return this.probability == ((Probability) obj).probability;
    }

    public float calculateEventNotOccur() {
        return 1-probability;
    }

    public float calculateEventsOccur() {
        return probabilityOfFirstEvent*probabilityOfSecondEvent;
    }
}
