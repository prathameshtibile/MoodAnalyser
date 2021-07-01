package Day21_Exception;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	 //UC1-TC1.1 Add
    @Test
    public  void givenIAmInSadMood_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }

    //UC1-TC1.2 Add
    @Test
   public void givenIAmInAnyMood_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    //UC1-TC-1.1 Repeat Add
    @Test
    public void givenIAmInSadMood_shouldReturnHappy() 
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }
    
    //UC1-TC-1.2 Repeat Add
    @Test
    public void givenIAmInHappyMood_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    //UC2.1 - given Null exception return HAPPY Add
    @Test
    public void givenNullException_shouldReturnHappy() 
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }
		
	}


