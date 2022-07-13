package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() { //TC 1.1 "I am in sad mood"
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assertions.assertEquals(mood, "SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() { //TC 1.2 I am in happy mood
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
        Assertions.assertEquals(mood1, "HAPPY");
    }
}
