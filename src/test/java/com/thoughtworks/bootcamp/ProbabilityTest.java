package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    void givenHeadAndTailsProbability_WhenCheck_ThenShouldReturnTrue(){
        float zero = 0.0f;
        Probability probability = new Probability(zero,zero);
        assertTrue(probability.checkEquality());
    }
}
