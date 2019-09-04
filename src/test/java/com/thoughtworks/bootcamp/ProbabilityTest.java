package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {
    private static Probability certainEvents;
    private static Probability impossibleEvents;

    @BeforeEach
    void setUp() {
        certainEvents = new Probability(1.0f);
        impossibleEvents = new Probability(0.0f);
    }

    @Test
    void givenZeroProbabilityOfTwoEvents_WhenCheckEquality_ThenShouldReturnTrue() {
        Probability ZeroProbabilityOfEvents = new Probability(0.0f);
        assertEquals(impossibleEvents, ZeroProbabilityOfEvents);
    }

}
