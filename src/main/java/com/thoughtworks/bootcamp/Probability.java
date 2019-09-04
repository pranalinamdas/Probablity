package com.thoughtworks.bootcamp;

public class Probability {

    private float value;

    public Probability(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        return this.value == ((Probability) obj).value;
    }


    public Probability not() {
        return new Probability(1.0f - value);

    }

    public Probability and(Probability event) {
        return new Probability(value * event.value);
    }

    public Probability or(Probability probabilityEvent) {
        return new Probability(value).not().and(new Probability(probabilityEvent.value).not()).not();
    }
}

