package Day21_Exception;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	 //UC1-TC1.1
    @Test
    public void givenIAmInSadMood_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }

    //UC1-TC1.2
    @Test
   public void givenIAmInAnyMood_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    //UC1-TC-1.1 Repeat
    @Test
    public void givenIAmInSadMood_shouldReturnsad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }
    //UC1-TC-1.2 Repeat
    @Test
    public void givenIAmInHappyMood_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }
	
		
	}


