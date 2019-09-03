package com.thoughtworks.bootcamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    void givenSameProbabilityOfTwoEvents_WhenCheckEquality_ThenShouldReturnTrue(){
        Probability probabilityOfTossingCoin = new Probability(0.5f);
        Probability probabilityOfEvenNumbersDice = new Probability(0.5f);

        assertTrue(probabilityOfTossingCoin.equals(probabilityOfEvenNumbersDice));
    }

    @Test
    void givenDifferentProbabilityOfTwoEvents_WhenCheckEquality_ThenShouldReturnFalse(){
        Probability probabilityOfTossingCoin = new Probability(0.3f);
        Probability probabilityOfEvenNumbersDice = new Probability(0.7f);

        assertFalse(probabilityOfTossingCoin.equals(probabilityOfEvenNumbersDice));
    }

    @Test
    void givenZeroProbabilityOfEvent_WhenCalculateEventNotOccur_ThenShouldReturnOne(){

        Probability eventWithZeroProbability = new Probability(0.0f);
        assertEquals(1.0f, eventWithZeroProbability.calculateEventNotOccur());
    }
}
