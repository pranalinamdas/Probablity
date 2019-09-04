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


 }
