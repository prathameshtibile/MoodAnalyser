package Day21_Exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	 //UC1-TC1.1
    @Test
    public void givenIAmInSadMood_shouldReturnSad() throws MoodAnalyserException 
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }

    //UC1-TC1.2
    @Test
    public void givenIAmInAnyMood_shouldReturnHappy() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    //UC1-TC-1.1 Repeat
    @Test
    public void givenIAmInSadMood_shouldReturnHappy() throws MoodAnalyserException 
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "SAD");
    }

    //UC1-TC-1.2 Repeat
    @Test
    public void givenIAmInHappyMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    //UC3
    @Test
   public void givenNullException_shouldInformUserToEnterValidMood() 
   {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try 
        {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserException e) 
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
   }

    //UC3
    @Test
    public void givenEmpty_shouldInformUserToEnterValidMood()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try
        {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserException e) 
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}

