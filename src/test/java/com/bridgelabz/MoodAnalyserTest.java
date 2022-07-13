package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {

    //  Analyse mood by passing the message in the constructor
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {//uc1 refactor
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    //Analyse mood by passing the message in the constructor
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//uc1refactor
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a happy message");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("HAPPY" , mood);
        }catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    // Custom Exception if User Provides Invalid Mood
    // Input message: null
    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {//uc 3.1
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    // Custom Exception if User Provides Invalid Mood
    //Input message: empty
    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {//uc3.2
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }
}