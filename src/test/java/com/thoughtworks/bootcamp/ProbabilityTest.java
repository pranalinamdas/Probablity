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

    @Test
    void givenZeroProbabilityOfOneEventAndOneProbabilityOfAnotherEvent_WhenCheckEquality_ThenShouldReturnZero() {
        assertNotEquals(impossibleEvents, certainEvents);
    }

    @Test
    void givenZeroProbabilityOfEvent_WhenCalculateEventNotOccur_ThenShouldReturnOne() {
        assertEquals(certainEvents, impossibleEvents.not());
    }

    @Test
    void givenOneProbabilityOfEvent_WhenCalculateEventNotOccur_ThenShouldReturnZero() {
        assertEquals(impossibleEvents, certainEvents.not());
    }

    @Test
    void givenZeroProbabilityOfTwoEvents_WhenCalculateBothEventsOccur_ThenShouldReturnZero() {
        assertEquals(impossibleEvents, impossibleEvents.and(impossibleEvents));
    }

    @Test
    void givenOneProbabilityOfOneEventAndZeroDotOneOfAnotherEvent_WhenCalculateBothEventsOccur_ThenShouldReturnZeroDotOne() {
        Probability zeroDotOne = new Probability(0.1f);
        assertEquals(new Probability(0.1f), certainEvents.and(zeroDotOne));
    }

    @Test
    void givenZeroProbabilityOfTwoEvents_WhenCalculateEitherOccurrence_ThenShouldReturnZero(){
        assertEquals(impossibleEvents, impossibleEvents.or(impossibleEvents));
    }
}
