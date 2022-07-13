package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {

    public void testMoodAnalysis_whenMoodIsSad() { //tc 1.1 Iamin sad mood
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//tc 1.2 Iamin sad mood
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood1,"HAPPY");

    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull() { //tc 2.1
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood2,"HAPPY");

    }
}
